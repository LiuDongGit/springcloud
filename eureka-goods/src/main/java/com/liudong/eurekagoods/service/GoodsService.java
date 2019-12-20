package com.liudong.eurekagoods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoodsService {

    @Autowired
    RestTemplate restTemplate;

    public Integer getNumber(Integer id){
        String url = "http://eureka-order:8081/testEureka/{id}";
        return  restTemplate.getForObject(url, Integer.class, id);
    }
}
