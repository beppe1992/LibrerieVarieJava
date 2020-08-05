package it.quartz.prova;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class InviaMailJob {



	public void metodoSchedulato() {

		System.out.println("inviando Email!!!!!");
	}


}