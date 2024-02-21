package com.sanjeev.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sanjeev.example1.beans.Vehicle;

@Configuration
public class ProjectConfig {
	
	@Bean
	Vehicle vehicle1() {
		var veh = new Vehicle();
		veh.setName("Audi 888");
		return veh;
	}
	
	@Bean
	Vehicle vehicle2() {
		var veh = new Vehicle();
		veh.setName("Honda");
		return veh;
	}
	
	@Bean
	@Primary
	Vehicle vehicle3() {
		var veh = new Vehicle();
		veh.setName("Maruti");
		return veh;
	}
	
	@Bean
	String hello() {
		return "Hello";
	}
	@Bean
	int intgerValue() {
		return 233;
	}
	

}
