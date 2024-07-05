package com.user.register.homeservice;

import java.util.Date;

import com.user.register.entity.RegisterEntity;

import jakarta.servlet.http.HttpServletResponse;

public interface RegisterService {

	RegisterEntity postData(RegisterEntity register);

	static void generateExcelFile(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	


}
