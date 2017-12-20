package com.fmi110.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 一定要添加 @WebService 注解 !!!
 */
@WebService
public interface HelloWorld {
    String sayHi(@WebParam(name="msg") String msg);

}
