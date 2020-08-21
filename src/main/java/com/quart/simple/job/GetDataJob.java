package com.quart.simple.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetDataJob implements Job{

	private static final Logger LOG = LoggerFactory.getLogger(GetDataJob.class);

	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("GetDataJob triggerd");
		System.out.println("Hello,World");
	}
}
