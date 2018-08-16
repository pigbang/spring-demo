package com.qunechi;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by bond on 2018/8/10.
 */
public class InitHelloSrping implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println("BeforeInitialization : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("AfterInitialization : " +  beanName);
        return bean;
    }
}
