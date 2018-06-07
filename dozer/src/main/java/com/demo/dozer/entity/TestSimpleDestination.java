package com.demo.dozer.entity;

public class TestSimpleDestination {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestSimpleDestination.name:" + this.name;
    }
}
