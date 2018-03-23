package com.padtast.designpatternexamples.strategy_case;

/**
 * Created by zhangshubin on 2018/3/23.
 */

public class SubwayStrategy implements Strategy{

    @Override
    public void travel() {
        System.out.println("subway");
    }

}
