package com.mocha.ws.bean;

import javax.xml.bind.annotation.*;

/**
 * Created by Mocha on 2017/11/11.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq",propOrder = {

})
@XmlRootElement(name = "BaseRequest")
public class BaseRequest {

    @XmlAttribute(name = "Type")
    protected String type;
    @XmlElement(name = "TestRequest")
    protected TestRequest testRequest;

    @XmlElement
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
