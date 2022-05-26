package com.myfirstproject.practice02;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelPractice02 {

    @Test
    public void createExcel() throws IOException {
        String path=".\\src\\test\\java\\Resources\\Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheetAt(0);
        System.out.println(sheet);
        Row row=sheet.getRow(0);
        System.out.println(row);
        Cell createCELL=row.createCell(2);
        createCELL.setCellValue("Population");
        System.out.println(createCELL);


    }
}
