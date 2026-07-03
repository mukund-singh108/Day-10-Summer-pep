package com.example.aop.Service;


import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void displayMessage(){
        System.out.println("Inside Businesss Method");
    }

    public void interviewDone(){
        System.out.println("Interview had done");
    }

}

