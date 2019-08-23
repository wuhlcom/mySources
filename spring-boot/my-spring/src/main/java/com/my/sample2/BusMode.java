package com.my.sample2;

import org.springframework.stereotype.Component;

/**
 * 汽车方式
 */
@Component
public class BusMode implements TrafficMode {

    @Override
    public TrafficCode getCode() {
        return TrafficCode.BUS;
    }

    @Override
    public Integer getFee() {
        return 10000;
    }

}
