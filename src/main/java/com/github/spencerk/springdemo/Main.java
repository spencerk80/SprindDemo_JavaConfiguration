package com.github.spencerk.springdemo;

import com.github.spencerk.springdemo.models.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext  context     = new ClassPathXmlApplicationContext("/Spring.xml");
        List<Student>       studentList = new ArrayList<>();

        //Make a list of students. These will automatically include their dependencies thanks to Spring FW
        for(byte i = 0; i < 5; i++)
            studentList.add((Student) context.getBean("student"));

        //Print out each Student's info
        studentList.forEach(System.out::println);
    }
}
