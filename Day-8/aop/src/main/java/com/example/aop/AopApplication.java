package com.example.aop;

import com.example.aop.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {
    @Autowired
    private MyService myService;
	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        myService.interviewDone();
    }
}
