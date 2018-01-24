package com.mocha.ws.bean;

import javax.xml.bind.annotation.*;

/**
 * Created by Mocha on 2017/11/11.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestRequest extends BaseRequest{
    @XmlAttribute(name = "Method")
    protected String method;

    @XmlElement(name = "Params")
    protected Params params;


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    @XmlType(name = "Params",propOrder = {

    })
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Params{

        @XmlAttribute(name = "First")
        protected String first;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }
    }


}
