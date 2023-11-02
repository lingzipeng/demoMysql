package com.gec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UserApp {

    public static void main(String[] args) {

        SpringApplication.run(UserApp.class,args);
    }
}
