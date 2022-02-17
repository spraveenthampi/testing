package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		//simulating multiline error
		String linetest = "Error parsing HTTP request header \n" +
				  "at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:419) ~[tomcat-embed-core-9.0.55.jar!/:na] \n" + 
				  "at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) ~[tomcat-embed-core-9.0.55.jar!/:na] \n" +
				  "at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:895) ~[tomcat-embed-core-9.0.55.jar!/:na] \n" + 
				  "at java.base/java.lang.Thread.run(Thread.java:834) ~[na:na]";
		System.out.println(linetest);
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
