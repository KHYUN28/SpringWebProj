package com.intheeast.springframe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.springframe.HelloSpring;

@Configuration
public class RootConfig {
	
	@Bean
	public HelloSpring helloSpring() {
		HelloSpring hs = new HelloSpring();
		return hs;
	}

}
