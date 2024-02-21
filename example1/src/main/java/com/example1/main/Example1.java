package com.example1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanjeev.example1.beans.Vehicle;
import com.sanjeev.example1.config.ProjectConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Example1 {
	
	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfig.class) ;
		
		var veh = context.getBean("vehicle1",Vehicle.class);
		log.info("vehical Audi context name ::" + veh.getName());
		
		var veh2 = context.getBean("vehicle2",Vehicle.class);
		log.info("vehical Honda context name ::" + veh2.getName());
		
		
		var veh3 = context.getBean("vehicle3",Vehicle.class);
		log.info("vehical Maruti context name ::" + veh3.getName());
		
		var veh4 = context.getBean(Vehicle.class);
		log.info("vehical Primary  context name ::" + veh4.getName());
		
		
		var str= context.getBean(String.class);
		
		log.info("String beal :: "+str);
		var int1 =context.getBean(int.class);
		log.info("Int value from the Bean ::ss "+ int1);
		
	}

}
