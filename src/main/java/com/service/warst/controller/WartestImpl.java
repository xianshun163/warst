package com.service.warst.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-01-30T12:01:09.879Z")
//@RestController
@RestSchema(schemaId = "test")
@RequestMapping("/xs")
public class WartestImpl {
	@Autowired
	private WartestDelegate userWartestDelegate;
	private RestTemplate restTemple = RestTemplateBuilder.create();

    @RequestMapping(value = "/avai",
    		method = RequestMethod.GET)
    public String available() {
    	String quoteString = "test";
		System.out.println(quoteString);

        return "I am available "+quoteString;
    }
  
	@RequestMapping(path = "/hello",
		method = RequestMethod.GET)
	public String helloRest( @RequestParam(name = "name") String name){
		return restTemple.getForObject("cse://helloworldproviderxs/helloworldprovider/helloworld?name="+name, String.class);
	}

//  @RequestMapping("/helloworld")
//  public String helloworld( @RequestParam(value = "name", required = true) String name){
//
//      return userWartestDelegate.helloworld(name);
//  }
    
}
