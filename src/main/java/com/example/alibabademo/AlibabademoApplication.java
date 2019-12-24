package com.example.alibabademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AlibabademoApplication {

    public static void main(String[] args) {
        /*SpringApplication.run(AlibabademoApplication.class, args);*/
//        提交到分支
//        提交到分支2222222
//        提交到主干
//        提交到主干111
//        分支切换主干并提交
//        主干切换到分支并提交

        ConfigurableApplicationContext applicationContext = SpringApplication.run(AlibabademoApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        System.err.println("user name :"+userName+"; age: "+userAge);
    }

}
