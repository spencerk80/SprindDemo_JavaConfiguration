package com.github.spencerk.springdemo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class Phone {
    private String mob;
    private static final Random rand = new Random();

    //Generate a random phone #
    public Phone() {
        StringBuilder sb = new StringBuilder("555-");

        sb.append(rand.nextInt(10));
        sb.append(rand.nextInt(10));
        sb.append(rand.nextInt(10));
        sb.append('-');
        sb.append(rand.nextInt(10));
        sb.append(rand.nextInt(10));
        sb.append(rand.nextInt(10));
        sb.append(rand.nextInt(10));

        this.mob = sb.toString();
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return mob;
    }
}
