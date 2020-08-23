package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(FirstApplication.class, args);
        Student s= context.getBean(Student.class);
        Student s1=context.getBean(Student.class);

        s.show();

        // output: in student
    }

}
