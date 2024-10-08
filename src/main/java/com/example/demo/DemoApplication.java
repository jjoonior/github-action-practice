package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

  @Value("${test.key}")
  private String testKey;

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World : " + testKey;
  }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
