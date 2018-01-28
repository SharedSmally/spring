package com.jpw.speing.ch02.exb01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
}
