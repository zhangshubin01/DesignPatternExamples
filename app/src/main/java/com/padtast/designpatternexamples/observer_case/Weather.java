package com.padtast.designpatternexamples.observer_case;

/**
 * Created by zhangshubin on 2018/3/22.
 */

public class Weather {
    private String description;

    public Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                '}';
    }
}