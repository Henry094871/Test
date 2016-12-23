package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

public class FileSourceExample {

    public static void main(String[] args) throws IOException {
        
        String filePath="D:/JavaEE_workspace/Test/build/classes/dwr.xml";
        
        Resource res1=new FileSystemResource(filePath);
        Resource res2=new ClassPathResource("dwr.xml");
        
        EncodedResource encRes=new EncodedResource(res2,"UTF-8");
        String content=FileCopyUtils.copyToString(encRes.getReader());
        System.out.println(content);
        
        InputStream ins1=res1.getInputStream();
        InputStream ins2=res2.getInputStream();
        
        System.out.println("res1:"+res1.getFilename());
        System.out.println("res2:"+res2.getFilename());
        
        
    }
}
