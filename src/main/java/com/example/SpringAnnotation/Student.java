package com.example.SpringAnnotation;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Student {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){
        System.out.println("framwork-1 called");
    }
    public Student(String Name){
        System.out.println("Framwork-2 called");
        this.name=Name;


    }
}
