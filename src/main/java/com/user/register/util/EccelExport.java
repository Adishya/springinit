package com.user.register.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.user.register.entity.RegisterEntity;
import com.user.register.repository.Repo;

@Component
public class EccelExport {
//    
//	 public void exportToExcel(String excelFilePath) {
//	        String jdbcUrl = "jdbc:mysql://localhost:3306/register";
//	        String username = "root";
//	        String password = "your_password"; // Replace with your MySQL password
//
//	        String sqlQuery = "SELECT id, name, email, phonenumber FROM register_entity";
//
//	        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
//	             Statement stmt = conn.createStatement();
//	             ResultSet resultSet = stmt.executeQuery(sqlQuery)) {
//
//	            // Create Excel workbook and sheet
//	            Workbook workbook = new XSSFWorkbook();
//	            Sheet sheet = workbook.createSheet("Data");
//
//	            // Create header row
//	            Row headerRow = sheet.createRow(0);
//	            headerRow.createCell(0).setCellValue("ID");
//	            headerRow.createCell(1).setCellValue("Name");
//	            headerRow.createCell(2).setCellValue("Email");
//	            headerRow.createCell(3).setCellValue("Phone Number");
//
//	            // Iterate through result set and populate data rows
//	            int rowNum = 1;
//	            while (resultSet.next()) {
//	                Row row = sheet.createRow(rowNum++);
//	                row.createCell(0).setCellValue(resultSet.getInt("id"));
//	                row.createCell(1).setCellValue(resultSet.getString("name"));
//	                row.createCell(2).setCellValue(resultSet.getString("email"));
//	                row.createCell(3).setCellValue(resultSet.getLong("phonenumber"));
//	            }
//
//	            // Write workbook to file
//	            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
//	                workbook.write(outputStream);
//	                System.out.println("Excel file exported successfully to: " + excelFilePath);
//	            }
//
//	        } catch (SQLException | IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	    	EccelExport exporter = new EccelExport();
//	        exporter.exportToExcel("C:\\Users\\user\\Desktop\\ExcelFiles\\customerdetail.xlsx");
//	    }
	}