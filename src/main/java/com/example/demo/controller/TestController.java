package com.example.demo.controller;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/test/")
@Slf4j
public class TestController {

	@GetMapping("hello")
	public String test() {
		String linetest = "Error parsing HTTP request header \n" +
				  "at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:419) ~[tomcat-embed-core-9.0.55.jar!/:na] \n" + 
				  "at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) ~[tomcat-embed-core-9.0.55.jar!/:na] \n" +
				  "at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:895) ~[tomcat-embed-core-9.0.55.jar!/:na] \n" + 
				  "at java.base/java.lang.Thread.run(Thread.java:834) ~[na:na]";
		
		log.debug("hello world logging: DEBUG -- JSON");
		log.error("hello world logging: ERROR -- JSON");
		//log.info("hello world logging: INFO -- JSON");
		log.warn("hello world logging: WARN -- JSON");
		
		log.info(linetest);
		
		return "hello world";
	}
	
	@GetMapping("exception")
	public void exception() throws AccountNotFoundException {
//		PrintSt
		new AccountNotFoundException().printStackTrace();
	}

}
