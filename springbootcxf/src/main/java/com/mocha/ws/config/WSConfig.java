package com.mocha.ws.config;

import com.mocha.ws.service.MochaServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;


import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mocha on 2017/11/11.
 */
@Configuration
public class WSConfig {

    @Bean
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/ws/*");
    }


    @Autowired
    public MochaServiceImpl mochaService(){
        return new MochaServiceImpl();
    }


    @Bean(name = Bus.DEFAULT_BUS_ID)
     public SpringBus springBus() {
         return new SpringBus();
     }

     @Bean
     public EndpointImpl endpoint(){
         EndpointImpl endpoint = new EndpointImpl(springBus(), mochaService());
         endpoint.publish("/test");
         return endpoint;
     }





}
