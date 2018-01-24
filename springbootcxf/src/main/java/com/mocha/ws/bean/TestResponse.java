package com.mocha.ws.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mocha on 2017/11/11.
 */
@XmlRootElement(name = "TestResp")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestResponse extends BaseResponse{
    @XmlAttribute(name = "Method")
    protected String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
