package com.demo.dozer.entity;

public class TestSimpleSource {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestSimpleSource.name:" + this.name;
    }
}
