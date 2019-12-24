package com.example.alibabademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AlibabademoApplication {

    public static void main(String[] args) {
        /*SpringApplication.run(AlibabademoApplication.class, args);*/
//        提交到分支
//        提交到分支2222

        ConfigurableApplicationContext applicationContext = SpringApplication.run(AlibabademoApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        System.err.println("user name :"+userName+"; age: "+userAge);
    }

}
