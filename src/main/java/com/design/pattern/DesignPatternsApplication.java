package com.design.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
        log.info("------------Factory design pattern started------------");
		SpringApplication.run(DesignPatternsApplication.class, args);
        log.info("------------Factory design pattern end------------");
	}

}
