package com.example.DynamicScheduleEx1;

import com.example.DynamicScheduleEx1.repository.ConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public  class DynamicScheduleEx1Application {
	public static void main(String[] args) {
		SpringApplication.run(DynamicScheduleEx1Application.class, args);
	}



}
