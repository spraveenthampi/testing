package com.example.demo.controller;

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
		log.debug("hello world logging: DEBUG -- JSON");
		log.error("hello world logging: ERROR -- JSON");
		log.info("hello world logging: INFO -- JSON");
		log.warn("hello world logging: WARN -- JSON");
		return "hello world";
	}

}
