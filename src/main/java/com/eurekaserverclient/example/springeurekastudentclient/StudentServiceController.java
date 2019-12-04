package com.eurekaserverclient.example.springeurekastudentclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
    public String getStudents() {
        System.out.println("Getting Student details for ");
 
       
        return "Hello Students";
    }
}