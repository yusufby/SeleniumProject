package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelPractice extends TestBase {
    @Test
    public void excelTet() throws IOException {
        String setUp=".\\src\\test\\java\\Resources\\Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(setUp);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheetAt(0);
        System.out.println(sheet.toString());
        Row row=sheet.getRow(0);
        System.out.println(row.toString());
        System.out.println("===========");
        Cell cell=row.getCell(0);
        System.out.println(cell);
        String countryDC=sheet.getRow(1).getCell(1).toString();
        Assert.assertEquals("D.C", countryDC);

        int lastrow=sheet.getLastRowNum()+1;
        System.out.println(lastrow);

        Map<String, String>allCountries=new HashMap<>();
        for (int i = 0; i < lastrow; i++) {
            String countries=sheet.getRow(i).getCell(0).toString();
            String state=sheet.getRow(i).getCell(1).toString();
            allCountries.put(countries,state);
        }
        System.out.println(allCountries);


    }

}
