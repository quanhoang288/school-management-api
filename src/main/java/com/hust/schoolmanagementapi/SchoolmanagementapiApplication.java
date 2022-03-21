package com.hust.schoolmanagementapi;

import com.hust.schoolmanagementapi.database.seeder.DatabaseSeeder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolmanagementapiApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SchoolmanagementapiApplication.class, args);
		DatabaseSeeder databaseSeeder =  context.getBean(DatabaseSeeder.class);
		databaseSeeder.run();
	}

}
