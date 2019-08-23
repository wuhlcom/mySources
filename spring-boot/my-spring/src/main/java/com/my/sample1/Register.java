package com.my.sample1;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

// 问题的提出
//         在实际工作中，我们经常会遇到一个接口及多个实现类的情况，并且在不同的条件下会使用不同的实现类。从使用方式上看，有些类似SPI的用法，
//         但是由于SPI的使用并不是太方便，那么怎么办呢？我们可以借助ApplicationContext的getBeansOfType来实现我们需要的结果

@Service("register")
public class Register implements InitializingBean, ApplicationContextAware {
    private Map<String, ServiceInterface> serviceImplMap = new HashMap<>();
    private Map<ServiceType, ServiceInterface> serviceImplTypeMap = new HashMap<>();
    private ApplicationContext applicationContext;

    // 获取spring的上下文
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    // 获取接口实现类的所有bean，并按自己定的规则放入map中
    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, ServiceInterface> beanMap = applicationContext.getBeansOfType(ServiceInterface.class);
        // 以下代码是将bean按照自己定的规则放入map中，这里我的规则是key：service.toString();value:bean
        // 调用时，参数传入service.toString()的具体字符串就能获取到相应的bean
        // 此处也可以不做以下的操作，直接使用beanMap,在调用时，传入bean的名称
        for (ServiceInterface serviceImpl : beanMap.values()) {
            serviceImplMap.put(serviceImpl.toString(), serviceImpl);
        }


        // Map<String, ServiceInterface> map = applicationContext.getBeansOfType(ServiceInterface.class);
        // beanMap.forEach((key, value) -> serviceImplTypeMap.put(value.getType(), value));

    }

    public ServiceInterface getServiceImpl(String name) {
        return serviceImplMap.get(name);
    }

    public ServiceInterface getServiceImpl(ServiceType serviceType) {
        return serviceImplMap.get(serviceType);
    }


}
