package com.demo.dozer;

import com.demo.dozer.entity.TestComplexDestination;
import com.demo.dozer.entity.TestSimpleDestination;
import com.demo.dozer.entity.TestSimpleSource;
import com.demo.dozer.entity.TestComplexSource;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;

public class MainApp {
    public static void main(String[] args) {
        Mapper mapper1 = DozerBeanMapperBuilder.buildDefault();
        String basePath = "mappings/%s";
        Mapper mapper2 = DozerBeanMapperBuilder.create().withMappingFiles(String.format(basePath, "testMapping.xml")).build();

        //Simple1
        TestSimpleSource simpleSource1 = new TestSimpleSource();
        simpleSource1.setName("test simple source object1");
        TestSimpleDestination simpleDestination1 = mapper1.map(simpleSource1, TestSimpleDestination.class);
        System.out.println(simpleDestination1);

        //Simple2
        TestSimpleSource simpleSource2 = new TestSimpleSource();
        simpleSource2.setName("test simple source object2");
        TestSimpleDestination simpleDestination2 = new TestSimpleDestination();
        mapper1.map(simpleSource2, simpleDestination2);
        System.out.println(simpleDestination2);

        //Complex
        TestComplexSource testComplexSource = new TestComplexSource();
        testComplexSource.setNameSource("this is source field value");
        TestComplexDestination destObject = mapper2.map(testComplexSource, TestComplexDestination.class);
        System.out.println(destObject);
    }
}
