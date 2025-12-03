package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jmx.export.SpringModelMBean;

import com.example.web.bean.FlightBean;
import com.example.web.service.FlightService;

@SpringBootApplication
public class SpringWebApplication {
	private final FlightService flightService;
	public SpringWebApplication(FlightService flightService) {
		this.flightService= flightService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
}
