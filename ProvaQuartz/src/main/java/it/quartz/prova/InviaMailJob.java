package it.quartz.prova;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class InviaMailJob extends QuartzJobBean {

	private InviaMailTask inviaMailTask;

	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		inviaMailTask.inviaMail();
	}

	public void setInviaMailTask(InviaMailTask inviaMailTask) {
		this.inviaMailTask = inviaMailTask;
	}

}