package com.my.sample3;

import com.my.sample2.TrafficCode;
import com.my.sample2.TrafficMode;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 汽车方式
 */
// @Component
// public class BusMode implements TrafficMode, InitializingBean {
//
//     @Autowired
//     public ITrafficModeFactory iTrafficModeFactory ;
//
//     @Override
//     public TrafficCode getCode() {
//         return TrafficCode.BUS;
//     }
//
//     @Override
//     public Integer getFee() {
//         return 10000;
//     }
//
//     @Override
//     public void afterPropertiesSet() {
//         iTrafficModeFactory.register(TrafficCode.BUS,this);
//     }
// }
