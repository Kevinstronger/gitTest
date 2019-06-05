package com.tsing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试用例的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的");
    }
}
