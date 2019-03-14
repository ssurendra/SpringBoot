package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class TrainingProvider {


	@Lookup
	public abstract Course getFreshCourse();

	public TrainingProvider() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Training called");
	}


	
}
