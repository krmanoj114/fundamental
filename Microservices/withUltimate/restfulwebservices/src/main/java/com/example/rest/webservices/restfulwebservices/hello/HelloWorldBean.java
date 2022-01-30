package com.example.rest.webservices.restfulwebservices.hello;

public class HelloWorldBean {


    private final String message;

    public HelloWorldBean(String hello_world) {
        this.message = hello_world;
    }
    public String getMessage() {
        return message;
    }
}
