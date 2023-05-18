package com.example.javaspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
             Student george = new Student(
                  "George",
                  "george@gmail.com",
                   LocalDate.of(1978, Month.MARCH, 18),
                   45
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1990, Month.APRIL, 23),
                    33
            );

            repository.saveAll(
                    List.of(george, alex)
            );
        };
    }
}
