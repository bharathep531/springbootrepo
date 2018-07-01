package com.javasampleapproach.angularjpapostgresql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@RequestMapping("/")
	ModelAndView home(ModelAndView modelAndView) {

		modelAndView.setViewName("home");

		return modelAndView;
	}
	
	/*@Bean
	public DataSource dataSource() 
	{
	  JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
	  DataSource dataSource = dataSourceLookup.getDataSource("java:comp/env/jdbc/MyDataSourceName");
	  return dataSource;
	}*/
}