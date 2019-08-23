package com.my.sample3;

import com.my.sample2.TrafficCode;
import com.my.sample2.TrafficMode;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 交通方式工厂类
 */
// @Component
// public class TrafficModeFactory implements ITrafficModeFactory {
//
//     private static Map<TrafficCode, TrafficMode> trafficBeanMap = new ConcurrentHashMap<>();;
//
//     @Override
//     public void register(TrafficCode code, TrafficMode trafficMode) {
//         trafficBeanMap.put(code, trafficMode);
//     }
//
//     public static <T extends TrafficMode> T getTrafficMode(TrafficCode code) {
//         return (T)trafficBeanMap.get(code);
//     }
//
// }
