package com.example.designpatterns.creational.singleton;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class LazySingletonObject {
    private final String name;
    private static volatile LazySingletonObject uniqueInstance;
    private LazySingletonObject(String name) {
        this.name = name;
    }
    public static LazySingletonObject getInstance(){
        if (uniqueInstance == null){
            synchronized (LazySingletonObject.class){
                if (uniqueInstance == null){
                    Random random = new Random();
                    uniqueInstance = new LazySingletonObject(String.valueOf(random.nextInt()));
                }
            }
        }
        return uniqueInstance;
    }
    public void sayHi(){
        log.info("Hello world, I am {}", name);
    }
}
