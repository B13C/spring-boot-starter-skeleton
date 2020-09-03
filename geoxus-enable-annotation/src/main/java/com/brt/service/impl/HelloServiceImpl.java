package com.brt.service.impl;

import com.brt.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String str) {
        return "枫叶思源 : " + str;
    }
}
