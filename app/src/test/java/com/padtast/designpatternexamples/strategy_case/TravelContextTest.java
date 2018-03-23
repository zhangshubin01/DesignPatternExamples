package com.padtast.designpatternexamples.strategy_case;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangshubin on 2018/3/23.
 */
public class TravelContextTest {
    @Test
    public void test1() throws Exception {
        TravelContext travelContext=new TravelContext();
        travelContext.setStrategy(new PlaneStrategy());
        travelContext.travel();
        travelContext.setStrategy(new WalkStrategy());
        travelContext.travel();
        travelContext.setStrategy(new SubwayStrategy());
        travelContext.travel();
    }

}