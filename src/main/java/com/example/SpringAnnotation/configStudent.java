package com.example.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configStudent {
    @Bean
    public Student getStudent(){
        System.out.println("Spring call Bean");
        return new Student("Suvadip Majhi");
    }

}
