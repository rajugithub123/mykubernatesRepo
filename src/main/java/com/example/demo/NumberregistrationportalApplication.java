package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Dependent;
import com.example.demo.entities.Registration;
import com.example.demo.service.RegistrationService;

@SpringBootApplication
public class NumberregistrationportalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(NumberregistrationportalApplication.class, args);
		
		RegistrationService registrationService=context.getBean("registrationService",RegistrationService.class);
	
		Registration registration=new Registration();
		Date date=new Date();
		Dependent dependent=new Dependent();
		dependent.setDependentId(1);
		dependent.setDependentName("ramu");
		dependent.setDOB(date);
		List<Dependent> dependents =new ArrayList();
		dependents.add(dependent);
	

	   registration.setId(1);
		registration.setName("raju");
		registration.setAddress("hyd");
		registration.setState("telangana");
		registration.setCountry("India");
		registration.setEmailAddress("raju@gmail.com");
		registration.setContactNo(995465423);
		registration.setDob(date);
	
		registration.setPan("pan");
		registration.setDependents(dependents);
		registrationService.createRegistration(registration);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
