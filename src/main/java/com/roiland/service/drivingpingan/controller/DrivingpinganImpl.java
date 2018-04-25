package com.roiland.service.drivingpingan.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-25T08:01:12.924Z")

@RestSchema(schemaId = "drivingpingan")
@RequestMapping(path = "/drivingpingan", produces = MediaType.APPLICATION_JSON)
public class DrivingpinganImpl {

    @Autowired
    private DrivingpinganDelegate userDrivingpinganDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDrivingpinganDelegate.helloworld(name);
    }

}
