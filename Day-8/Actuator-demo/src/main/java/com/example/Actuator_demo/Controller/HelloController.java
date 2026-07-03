package com.example.Actuator_demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/getActuator")
    public String sayHello(){
        return "Hello actuator is working";
    }
}
