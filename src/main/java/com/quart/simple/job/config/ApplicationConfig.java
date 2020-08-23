package com.quart.simple.job.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationConfig implements ApplicationContextAware{
	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) {
		ApplicationConfig.applicationContext = applicationContext;
    }
    /**
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    /**
     * 获取对象
     *
     * @param name
     * @return Object
     * @throws BeansException
     */
    public static Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }

}
