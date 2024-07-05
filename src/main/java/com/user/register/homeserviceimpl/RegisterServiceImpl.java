package com.user.register.homeserviceimpl;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.register.entity.RegisterEntity;
import com.user.register.homeservice.RegisterService;
import com.user.register.repository.Repo;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    Repo registerRepo;

    @Override
    public RegisterEntity postData(RegisterEntity register) {
        return registerRepo.save(register);
    }

    
}

