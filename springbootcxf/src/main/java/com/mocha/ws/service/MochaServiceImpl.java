package com.mocha.ws.service;

import com.mocha.ws.bean.TestRequest;
import com.mocha.ws.bean.TestResponse;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Created by Mocha on 2017/11/11.
 */
@WebService(endpointInterface = "com.mocha.ws.service.MochaService")
public class MochaServiceImpl implements MochaService{

    @Override
    @WebMethod
    @WebResult(name = "TestRsp")
    public TestResponse testMethod(TestRequest request) {

        return null;

    }
}
