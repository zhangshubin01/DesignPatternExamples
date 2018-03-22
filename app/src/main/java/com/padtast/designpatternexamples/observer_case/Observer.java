package com.padtast.designpatternexamples.observer_case;

/**
 * Created by zhangshubin on 2018/3/22.
 */

public interface Observer<T> {
    void onUpdate(Observable<T> observable,T data);
}