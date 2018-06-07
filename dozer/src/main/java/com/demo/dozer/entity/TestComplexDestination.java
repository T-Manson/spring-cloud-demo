package com.demo.dozer.entity;

import org.dozer.Mapping;

public class TestComplexDestination {
    //注解方式配置映射关系
//    @Mapping("nameSource")
    private String nameDestination;

    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    @Override
    public String toString() {
        return "TestComplexDestination.field.nameDestination:" + this.nameDestination;
    }
}
