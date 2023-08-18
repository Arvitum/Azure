package com.example.linuxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LinuxAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinuxAppApplication.class, args);
	}

}
