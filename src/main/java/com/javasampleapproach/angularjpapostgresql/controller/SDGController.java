package com.javasampleapproach.angularjpapostgresql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class SDGController {


	@RequestMapping("/hail")
	public String hailWithResponse(){
		 return "I am hailing at 73 degree east and time";
	}
}
