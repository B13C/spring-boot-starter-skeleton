package com.geoxus.app.service.impl;

import com.geoxus.app.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    private String str;

    @Override
    public String print(String str) {
        return "Aware : " + str;
    }

    @Override
    public void setAware(String str) {
        this.str = str;
    }
}
