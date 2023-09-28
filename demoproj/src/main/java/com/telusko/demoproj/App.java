package com.telusko.demoproj;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory= new ClassPathXmlApplicationContext("file:src/main/java/com/telusko/demo2prgm/spring.xml");
        Alien obj1=(Alien)factory.getBean("alien");
        obj1.code();
        System.out.println(obj1.getAge()); 
    }
}
