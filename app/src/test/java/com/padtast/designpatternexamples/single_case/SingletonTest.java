package com.padtast.designpatternexamples.single_case;

import com.padtast.designpatternexamples.builder_case.Person;
import com.padtast.designpatternexamples.observer_case.Observable;
import com.padtast.designpatternexamples.observer_case.Observer;
import com.padtast.designpatternexamples.observer_case.Weather;

import org.junit.Test;

import static com.padtast.designpatternexamples.builder_case.Person.*;
import static org.junit.Assert.*;

/**
 * Created by zhangshubin on 2018/3/20.
 */
public class SingletonTest {
    @Test
    public void test1() throws Exception {
        Observable<Weather> observable=new Observable<Weather>();
        Observer<Weather> observer1=new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者1："+data.toString());
            }
        };
        Observer<Weather> observer2=new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者2："+data.toString());
            }
        };

        observable.register(observer1);
        observable.register(observer2);


        Weather weather=new Weather("晴转多云");
        observable.notifyObservers(weather);

        Weather weather1=new Weather("多云转阴");
        observable.notifyObservers(weather1);

        observable.unregister(observer1);

        Weather weather2=new Weather("台风");
        observable.notifyObservers(weather2);

    }

}