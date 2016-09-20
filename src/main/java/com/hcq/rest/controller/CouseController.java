package com.hcq.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcq.rest.bean.Couse;

@RestController
public class CouseController {
	
	    @RequestMapping("/couse")
	    public Couse couse(@RequestParam(value="name",defaultValue="web service") String name){
	        return new Couse(1l,String.format("Hello,%s", name));
	    }
}
