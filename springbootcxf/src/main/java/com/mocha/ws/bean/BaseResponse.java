package com.mocha.ws.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Mocha on 2017/11/11.
 */
@XmlType(name = "BaseResp")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseResponse {
    @XmlAttribute(name = "result")
    protected String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
