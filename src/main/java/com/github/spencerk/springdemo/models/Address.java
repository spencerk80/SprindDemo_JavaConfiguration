package com.github.spencerk.springdemo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

public class Address {
    private static final String[] ZIP_CODES  = {"12345", "23456", "34567", "45678"},
                                  STATES     = {"OR", "CA", "MI", "WI", "VA", "GA", "MO", "NY", "DE"},
                                  CITIES     = {"Portland", "Springfield", "Medford", "Salem", "Bandon"};
    private static final Random   rand       = new Random();

    private String city;
    private String state;
    private String country;
    private String zipcode;

    //Generate random address
    public Address() {
        this.city = CITIES[rand.nextInt(CITIES.length)];
        this.state = STATES[rand.nextInt(STATES.length)];
        this.country = "USA";
        this.zipcode = ZIP_CODES[rand.nextInt(ZIP_CODES.length)];
    }

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
