package com.example.application.config;

//import com.example.application.Entity.Student;
import com.example.application.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentconfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo){
        return args -> {


        };

    }
}
