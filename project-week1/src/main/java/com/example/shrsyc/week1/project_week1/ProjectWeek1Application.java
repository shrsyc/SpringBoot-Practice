package com.example.shrsyc.week1.project_week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectWeek1Application implements CommandLineRunner {

	@Autowired
	CakeBaker c;

	public static void main(String[] args) {
		SpringApplication.run(ProjectWeek1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(c.bakeCake());
	}
}
