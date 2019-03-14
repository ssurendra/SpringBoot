package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class MethodInjectionApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx = SpringApplication.run(MethodInjectionApplication.class, args);
	 TrainingProvider trainingprovider = ctx.getBean(TrainingProvider.class);
	 trainingprovider.getFreshCourse();
	 TrainingProvider trainingprovider1 = ctx.getBean(TrainingProvider.class);
	 trainingprovider1.getFreshCourse();
	 TrainingProvider trainingprovider3 = ctx.getBean(TrainingProvider.class);
		
	}
	
	@Bean
	@Scope(scopeName= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Course course()
	{
		return new Course();
	}

	
	@Bean
	@Scope(scopeName= ConfigurableBeanFactory.SCOPE_SINGLETON)
	public TrainingProvider provider()	{
		return new TrainingProvider() {
			
			@Override
			public Course getFreshCourse(){
				return new Course();
			}	
				
		};			
	}
	

}
