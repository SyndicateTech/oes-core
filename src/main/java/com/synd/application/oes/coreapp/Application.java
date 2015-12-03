package com.synd.application.oes.coreapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * *****************************************************************
 *
 * @author - Md. Badi-Uz-Zaman Shajib
 * @copyright 2015.
 * @email - mbzshajib@gmail.com
 * @gitHub - https://github.com/mbzshajib
 * @date: 12/3/2015
 * @time: 11:59 PM
 * ****************************************************************
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("Starting OES-CORE server");
        ApplicationContext applicationContext = SpringApplication.run(Application.class,args);
    }
}
