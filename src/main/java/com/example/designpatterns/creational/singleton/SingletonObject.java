package com.example.designpatterns.creational.singleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonObject {
    private String name;
    private static SingletonObject uniqueInstance = new SingletonObject("Hai");
    private SingletonObject(String name) {
        this.name = name;
    }
    public static SingletonObject getInstance(){
        return uniqueInstance;
    }










    public void sayHi(){
        log.info("Hello world, I am {}", name);
    }
}
