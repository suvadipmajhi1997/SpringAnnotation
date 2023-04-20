package com.example.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public String teach(){
        return  "he is teaching springboot";
    }
}
