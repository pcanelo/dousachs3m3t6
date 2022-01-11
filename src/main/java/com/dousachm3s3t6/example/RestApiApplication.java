package com.dousachm3s3t6.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dousachm3s3t6.example.model.Student;
import com.dousachm3s3t6.example.repository.StudentRepository;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StudentRepository repository) {
		return args -> {
			repository.save(new Student("Juan", "Perez", "Junior"));
			repository.save(new Student("Marcos", "Perez", "Senior"));
			repository.save(new Student("Sebastian", "Boric", "Goma"));
			repository.save(new Student("Gabriel", "Piñera", "Goma"));
		};
	}
}
