package com.quart.simple.job;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.quart.simple.job.service.SysParmService;

public class TestSpring {

	public static void main(String []xyz) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
//		SysParmService service = ctx.getBean(SysParmService.class);
//		System.out.println(service.findAll().size());
		
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\d9741\\git\\quartz1\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
		SysParmService service = ctx.getBean(SysParmService.class);
		System.out.println(service.findAll().size());
		
	}
}
