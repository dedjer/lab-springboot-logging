package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationMain.class);

    public static String myStringVariable = "0";

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);

        logger.info("Hello World!");
        logger.info("going into mymethod1");
        mymethod1();
    }

    public static void mymethod1()
    {
        logger.info("Firstname= " + myStringVariable);
        logger.info("in mymethod1");

        myStringVariable = "1";

        logger.info("going into mymethod2");
        mymethod2();
        logger.info("out of mymethod2, back in mymethod1");

        logger.info("going into mymethod3");
        mymethod3();
        logger.info("out of mymethod3, back in mymethod1");
    }


    public static void mymethod2()
    {
        myStringVariable = "2";


        logger.info("in mymethod2");
    }

    public static void mymethod3()
    {

        myStringVariable = "3";

        logger.info("this slac where my error is");
        logger.info("in mymethod2");
    }

}
