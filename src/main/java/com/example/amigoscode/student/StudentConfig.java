package com.example.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mark = new Student("Mark Kamau", "markxkamau@gmail.com", LocalDate.now());
            Student alex = new Student("Alex Kamau", "alexndeg@gmail.com",LocalDate.now() );
            studentRepository.saveAll(List.of(mark, alex));
        };
    }
}
