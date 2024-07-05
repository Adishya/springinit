package com.user.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.register.entity.RegisterEntity;
import com.user.register.homeservice.RegisterService;

import jakarta.servlet.http.HttpServletResponse;

@CrossOrigin
@RestController
public class DataController {
	@Autowired
	RegisterService service;

	@PostMapping("/postdata")
	public RegisterEntity postData(@RequestBody RegisterEntity register) {
		return service.postData(register);
	}
	
	@GetMapping("/excel")
	public void generateExcel(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		String 	headerKey="Content-Disposition";
		String headerValue="attachment;filename=customerdetail.xls";
		response.setHeader(headerKey,headerValue);
		RegisterService.generateExcelFile(response);
		
	}
	
}
