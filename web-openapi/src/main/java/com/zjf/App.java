package com.zjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class App {
    /**
     * 工程启动
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("---------------启动完成-----------------");
    }

}
