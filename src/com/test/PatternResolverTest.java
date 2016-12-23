package com.test;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PatternResolverTest {

    public static void main(String[] args) throws IOException {
        
        ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        
        Resource res[] =resolver.getResources("classpath*:*.xml");
        
        for(Resource r : res) {
            System.out.println(r.getDescription());
        }
                
    }
}
