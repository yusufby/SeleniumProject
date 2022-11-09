package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class practice2 {
    public static void main(String[] args) throws IOException {
        //write the path
        String path = ".\\src\\test\\java\\Resources\\Capitals.xlsx";
        //fileinputStream class
        FileInputStream fileInputStream = new FileInputStream(path);
        //workbook
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(2);
        System.out.println(cell);

        String assertEt = sheet.getRow(0).getCell(2).toString();
        Assert.assertEquals("POPULATION", assertEt);

        int getRow = sheet.getLastRowNum() - 1;
        System.out.println(getRow);


        Map<String, String> countries = new HashMap<>();
        for (int i = 1; i < getRow; i++) {
            String country = sheet.getRow(i).getCell(0).toString();
            String city = sheet.getRow(i).getCell(1).toString();
            countries.put(country, city);
        }
        System.out.println(countries);

        //how to create new file
        sheet.getRow(1).createCell(2).setCellValue("yusuf");
        sheet.getRow(2).createCell(2).setCellValue("fatma");
        sheet.getRow(3).createCell(2).setCellValue("yakup");
        FileOutputStream fileoutput = new FileOutputStream(path);
        workbook.write(fileoutput);
        fileoutput.close();
        fileoutput.close();
        workbook.close();



    }

}
