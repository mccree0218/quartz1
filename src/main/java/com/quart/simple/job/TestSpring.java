package com.quart.simple.job;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quart.simple.job.service.SysParmService;

public class TestSpring {

	public static void main(String []xyz) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SysParmService service = ctx.getBean(SysParmService.class);
		System.out.println(service.findAll().size());
		
	}
}
