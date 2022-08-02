package com.github.spencerk.springdemo.config;

import com.github.spencerk.springdemo.models.Address;
import com.github.spencerk.springdemo.models.Phone;
import com.github.spencerk.springdemo.models.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public List<Phone> getPhones() {
        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone());
        phones.add(new Phone());

        return phones;
    }

    @Bean
    @Scope("prototype")
    public Address getAddress() {
        return new Address();
    }

    @Bean
    @Scope("prototype")
    public Student getStudent() {
        return new Student();
    }
}
