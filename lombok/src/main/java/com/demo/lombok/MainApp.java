package com.demo.lombok;


import com.demo.lombok.entity.Test;

public class MainApp {

    public static void main(String... args) {
        Test test = new Test(1, "test");
        System.out.println(test);
        System.out.println(test.getId());
        test.setName("modify by fmni");
        System.out.println(test.getName());
        System.out.println(test.toString());
    }

}

