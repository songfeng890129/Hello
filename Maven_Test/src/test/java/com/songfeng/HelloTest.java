package com.songfeng;

import org.junit.Test;

public class HelloTest {

    @Test
    public void test(){
        MavenTest mavenTest = new MavenTest();
        System.out.println(mavenTest.hello("maven ^_^"));
    }
}
