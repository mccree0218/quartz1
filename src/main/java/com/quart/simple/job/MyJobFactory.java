package com.quart.simple.job;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

public class MyJobFactory extends AdaptableJobFactory {

    //注入AutowireCapableBeanFactory 於web.xml/applicationContent 內注入
    @Autowired
    private AutowireCapableBeanFactory capableBeanFactory;
    
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        //調用父類方法
        Object jobInstance = super.createJobInstance(bundle);
        //透過反射機制取得該job實體
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
