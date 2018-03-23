package com.padtast.designpatternexamples.strategy_case;

/**
 * Created by zhangshubin on 2018/3/23.
 */
public class TravelContext {
    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        if (strategy != null) {
            strategy.travel();
        }
    }
}
