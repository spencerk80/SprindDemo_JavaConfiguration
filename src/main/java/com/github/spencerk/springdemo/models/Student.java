package com.github.spencerk.springdemo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private static int nextID;
    private static final String[] F_NAMES = {"Bob", "Tom", "Jerry", "Adam", "Susie", "Mary", "Amilia", "Harper"},
                                  L_NAMES = {"Smith", "Thompson", "Johnson", "Hitchcock", "Wayne", "Prime"};
    private static final Random   rand    = new Random();

    private int id;
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public Student() {
        this.id = nextID++;
        this.name = F_NAMES[rand.nextInt(F_NAMES.length)] + ' ' + L_NAMES[rand.nextInt(L_NAMES.length)];
    }

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = nextID++;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
