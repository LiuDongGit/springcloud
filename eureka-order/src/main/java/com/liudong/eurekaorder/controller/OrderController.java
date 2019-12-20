package com.liudong.eurekaorder.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class OrderController {

    @RequestMapping("/testEureka/{id}")
    public Integer testEureka(@PathVariable(name = "id") Integer id){
        Random random = new Random();
        int i = random.nextInt(9999);
        System.out.println("test_1 branch");
        return i+id;
    }
}
