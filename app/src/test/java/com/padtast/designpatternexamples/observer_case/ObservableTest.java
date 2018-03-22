package com.padtast.designpatternexamples.observer_case;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangshubin on 2018/3/22.
 */
public class ObservableTest {
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