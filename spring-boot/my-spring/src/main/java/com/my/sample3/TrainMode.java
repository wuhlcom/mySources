package com.my.sample3;

import com.my.sample2.TrafficCode;
import com.my.sample2.TrafficMode;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// /**
// //  * 火车方式
// //  */
// // @Component
// public class TrainMode implements TrafficMode, InitializingBean {
//
//     @Autowired
//     public ITrafficModeFactory iTrafficModeFactory ;
//
//     @Override
//     public TrafficCode getCode() {
//         return TrafficCode.TRAIN;
//     }
//
//     @Override
//     public Integer getFee() {
//         return 9000;
//     }
//
//     @Override
//     public void afterPropertiesSet() {
//         iTrafficModeFactory.register(TrafficCode.TRAIN,this);
//     }
//
// }
