package com.mocha.ws.service;

import com.mocha.ws.bean.TestRequest;
import com.mocha.ws.bean.TestResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by Mocha on 2017/11/11.
 */
@WebService
public interface MochaService {
    @WebMethod
    @WebResult(name = "TestResponse")
    TestResponse testMethod(@WebParam(name = "request") TestRequest request);
}
