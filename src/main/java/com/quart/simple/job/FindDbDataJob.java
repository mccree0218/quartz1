package com.quart.simple.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.quart.simple.job.service.SysParmService;
import com.quart.simple.job.service.impl.SysParmServiceImpl;

public class FindDbDataJob implements Job{
	private static final Logger LOG = LoggerFactory.getLogger(FindDbDataJob.class);
	
//	ApplicationContextAwarer context = (ApplicationContextAwarer) new ApplicationContextAwarer().getApplicationContext();
	
	@Autowired
	SysParmService sysParmService;

	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			LOG.debug("查db資料 --start--");
			SchedulerContext schedularContext = context.getScheduler().getContext();
			System.out.println(schedularContext);
//			ApplicationContext ctx = (ApplicationContext)schedularContext.get("applicationContext");
//			ApplicationContext ctx = (ApplicationContext)context.getScheduler().getContext().get("applicationContextSchedulerContextKey");
//			System.out.println(ctx);
//			SysParmService service = (SysParmService) ctx.getBean("sysParmService");
			System.out.println(sysParmService);
			System.out.println(sysParmService.findAll().size());
			LOG.debug("查db資料 --end--");
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		
	}
}
