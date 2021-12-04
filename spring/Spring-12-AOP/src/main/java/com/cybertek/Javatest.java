package com.cybertek;

import java.util.Arrays;
import java.util.List;

public class Javatest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three");

//        list.forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
