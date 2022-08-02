package com.github.spencerk.springdemo;

import com.github.spencerk.springdemo.config.AppConfig;
import com.github.spencerk.springdemo.models.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext  context     = new AnnotationConfigApplicationContext(AppConfig.class);
        List<Student>       studentList = new ArrayList<>();

        //Make a list of students. These will automatically include their dependencies thanks to Spring FW
        for(byte i = 0; i < 5; i++)
            studentList.add((Student) context.getBean(Student.class));

        //Print out each Student's info
        studentList.forEach(System.out::println);
    }
}
