package com.sp.test;

import java.util.Properties;

public class SystemPropsTest {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.forEach((key, value)-> {
            System.out.println(key + " : " + value);
        });
    }
}