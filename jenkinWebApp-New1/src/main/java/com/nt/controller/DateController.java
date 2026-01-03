package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {
	
	@GetMapping("/")
	public String homePage()
	{
		return "welcome";
	}
	
	@GetMapping("/dateurl")
	public String getDate(Map<String, Object> map)
	{
		
		map.put("date", LocalDateTime.now());
		return "date";
	}

}
