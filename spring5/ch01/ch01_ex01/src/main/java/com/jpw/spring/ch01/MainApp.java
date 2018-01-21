package com.jpw.spring.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(Config.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage("Hello World!");
      System.out.println("Message="+helloWorld.getMessage());
   }
}
