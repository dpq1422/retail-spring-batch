package com.retail;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RrasDataProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RrasDataProcessingApplication.class, args);
		System.out.println("Spring Application Started.....");
		String[] springConfig = { "batch/job/country-partitioner-job.xml" };

	    ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

	    JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
	    Job job = (Job) context.getBean("partitionJob");

	    try {

	      JobExecution execution = jobLauncher.run(job, new JobParameters());
	      System.out.println("Exit Status : " + execution.getStatus());
	      System.out.println("Exit Status : " + execution.getAllFailureExceptions());

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	      System.out.println("Done");
	}

}
