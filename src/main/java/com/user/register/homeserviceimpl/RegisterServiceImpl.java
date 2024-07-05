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

    public void generateExcelFile(HttpServletResponse response) throws IOException {
        List<RegisterEntity> registerList = registerRepo.findAll();
        System.out.println("Number of entities retrieved: " + registerList.size());

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("User Info");

        // Creating header row
        XSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Email");
        headerRow.createCell(3).setCellValue("Phone Number");

        // Writing data rows
        int dataRowIndex = 1;
        for (RegisterEntity entity : registerList) {
            XSSFRow dataRow = sheet.createRow(dataRowIndex);
            dataRow.createCell(0).setCellValue(entity.getId());
            dataRow.createCell(1).setCellValue(entity.getName());
            dataRow.createCell(2).setCellValue(entity.getEmail());
            dataRow.createCell(3).setCellValue(entity.getPhonenumber());
            dataRowIndex++;
        }

   
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=customerdetail.xlsx");


        ServletOutputStream ops = response.getOutputStream();
        workbook.write(ops);

        // Closing resources
        workbook.close();
        ops.close();
    }
}

