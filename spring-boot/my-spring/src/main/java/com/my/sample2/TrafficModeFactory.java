package com.my.sample2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 交通方式工厂类
 */
// 问题的提出
//         在实际工作中，我们经常会遇到一个接口及多个实现类的情况，并且在不同的条件下会使用不同的实现类。从使用方式上看，有些类似SPI的用法，
//         但是由于SPI的使用并不是太方便，那么怎么办呢？我们可以借助ApplicationContext的getBeansOfType来实现我们需要的结果
@Component
public class TrafficModeFactory implements ApplicationContextAware {

    private static Map<TrafficCode, TrafficMode> trafficBeanMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, TrafficMode> map = applicationContext.getBeansOfType(TrafficMode.class);
        trafficBeanMap = new HashMap<>();
        map.forEach((key, value) -> trafficBeanMap.put(value.getCode(), value));
    }

    // 方法能返回一个接口的全部实现类（前提是所有实现类都必须由Spring IoC容器管理）
    public static <T extends TrafficMode> T getTrafficMode(TrafficCode code) {
        return (T)trafficBeanMap.get(code);
    }

}
