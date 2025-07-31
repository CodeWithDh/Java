package Experiments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class exceltry {
    public static void main(String[] args){
        try{
            FileInputStream file=new FileInputStream("D:/Temporary Folder/try.xlsx");
            Workbook workbook=new XSSFWorkbook(file);
            Sheet sheet=workbook.getSheetAt(0);


        }catch(IOException e){
            System.out.println("Error: "+e);
        }


    }

}
