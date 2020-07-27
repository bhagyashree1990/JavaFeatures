package com.java5.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ExecutorsExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		/**
		Executor executor;
		ExecutorService executorService;
		ThreadPoolExecutor threadPoolExecutor;
		ScheduledExecutorService scheduledExecutorService;
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
		Executors executors;
		*/
		ExecutorService executorService1 = Executors.newFixedThreadPool(4);
		LOGGER.info("Demo: newFixedThreadPool");
		parallelTasks(executorService1);
		
		
		ExecutorService executorService2 = Executors.newCachedThreadPool();
		LOGGER.info("Demo: newCachedThreadPool");
		parallelTasks(executorService2);
		
		ExecutorService executorService3 = Executors.newSingleThreadExecutor();
		LOGGER.info("Demo: newSingleThreadExecutor");
		parallelTasks(executorService3);
		
		ScheduledExecutorService scheduledExecutorService1 = Executors.newScheduledThreadPool(4);
		LOGGER.info("Demo: newScheduledThreadPool");
		parallelTasks(scheduledExecutorService1);
		
		LOGGER.info("Demo: Callable");
		parallelCallableTasks(executorService1);
	}
	
	public static Runnable getTask() {
		return ()->{
			LOGGER.info(Thread.currentThread().getName()+" TASK PRINT");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}
	
	public static void parallelTasks(ExecutorService executorService) {
		for(int i=1;i<=10;i++) {
			Runnable command = getTask();
			executorService.execute(command);			
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {			
		}
		LOGGER.info("TASK COMPLETE");
	}
	
	public static void parallelTasks(ScheduledExecutorService executorService) {
		for(int i=1;i<=10;i++) {
			Runnable command = getTask();
			executorService.schedule(command, 1, TimeUnit.SECONDS);
//			executorService.scheduleAtFixedRate(command, 1, 5, TimeUnit.SECONDS);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()) {			
		}
		
		LOGGER.info("TASK COMPLETE");
	}
	
	public static Callable<Double> getCallableTask(){
		return ()->{
			Double value = Math.random()*1000;
			LOGGER.info(Thread.currentThread().getName()+" TASK NUMBER "+value);
			return value;
		};
	}
	
	public static void parallelCallableTasks(ExecutorService executorService) {
		List<Future<Double>> futureList = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			Callable<Double> command = getCallableTask();
			Future<Double> future =	executorService.submit(command);
			futureList.add(future);
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {			
		}
		LOGGER.info("READ FUTURE");
		for(Future<Double> future:futureList) {
			try {
				LOGGER.info("FUTURE: "+future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		LOGGER.info("TASK COMPLETE");
	}
	
}
