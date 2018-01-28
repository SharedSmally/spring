package com.jpw.speing.ch02.exb01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	   public static void main(String[] args) {
		      ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(Config.class);
		   
		      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		      helloWorld.setMessage("Hello World!");
		      System.out.println("Message="+helloWorld.getMessage());
		   }
}
