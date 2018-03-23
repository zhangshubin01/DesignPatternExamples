package com.padtast.designpatternexamples.strategy_case;

/**
 * Created by zhangshubin on 2018/3/23.
 */

public class WalkStrategy implements Strategy{

    @Override
    public void travel() {
        System.out.println("walk");
    }

}