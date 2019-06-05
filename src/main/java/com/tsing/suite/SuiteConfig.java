package com.tsing.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite 运行啦。。。");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 运行啦。。。");
    }
}
