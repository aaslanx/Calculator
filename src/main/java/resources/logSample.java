package com.app.tests;


import org.apache.log4j.Logger;
import org.junit.*;

public class LogginExample {

    Logger log = Logger.getLogger(LogginExample.class);

    @Before
    public void before(){
        //
        log.info("This is the BEFORE method");
    }


    @Test
    public void test(){
        //
        log.fatal("====== FATAL ======");
        log.info("===================");
        log.trace("Method: TRACE");
        log.warn("Method: WARN");
        RestAssured.get("https://uinames.com/api/");

    }

    @After
    public void afterTest(){
        //
        log.info("This is the AFTER method\nDONE============\n===========");
    }



}
