package com.geoxus.app;

import com.geoxus.app.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyAwareBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof HelloService) {
            ((MyAware) bean).setAware("Hello World");
        }
        return null;
    }
}
