package com.tsing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramsTest(String name, int age){
        System.out.println("This is "+ name + " and I am "+age + " years old");
    }
}
