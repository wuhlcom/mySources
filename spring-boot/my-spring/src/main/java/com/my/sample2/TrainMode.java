package com.my.sample2;

import org.springframework.stereotype.Component;

/**
 * 火车方式
 */
@Component
public class TrainMode implements TrafficMode {

    @Override
    public TrafficCode getCode() {
        return TrafficCode.TRAIN;
    }

    @Override
    public Integer getFee() {
        return 9000;
    }

}
