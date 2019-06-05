package com.tsing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ReporterTest {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void test3(){
        Assert.assertFalse(3.14==3.14);
    }
    @Test
    public void test4(){
        Assert.assertEquals(new Object[2],new Object[3]);
    }



}
