package com.fmi110.cxf.service.impl;

import com.fmi110.cxf.service.HelloWorld;


public class HelloWorldImpl implements HelloWorld{
    @Override
    public String sayHi(String msg) {
        System.out.println("sayHi() 被调用...");
        return "sayHi : "+msg;
    }

}
