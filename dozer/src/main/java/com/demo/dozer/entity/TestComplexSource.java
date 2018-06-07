package com.demo.dozer.entity;

public class TestComplexSource {
    private String nameSource;

    public String getNameSource() {
        return nameSource;
    }

    public void setNameSource(String nameSource) {
        this.nameSource = nameSource;
    }

    @Override
    public String toString() {
        return "TestComplexSource.field.nameSource:" + this.nameSource;
    }
}
