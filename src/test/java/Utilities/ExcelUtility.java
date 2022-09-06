package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ExcelUtility {
//  kendisine verilen path deki excelin, istenilen, sheetindeki
    // istenilen kolona kadar sütunları okuyup Arraylist formatında geri döndüren fonksiyonu yazınız.
    //  getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx","testCitizen", 2); 0-2

    public static void main(String[] args) throws IOException {

        // ArrayList<ArrayList<String>> tablo = getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx", "testCitizen", 4);
        // System.out.println(tablo);

        LocalDateTime datetimes = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String frmtdate = formatter.format(datetimes);





    }


    // TODO kendisine verilen "path,scenario, browsertipi, zaman parametreleri"  excele bütün veriyi yazcak.
    //  Dosyanın varlığını veya yokluğunu kontrol etmeyi bulunuz.

    public static void setexcel(String path, Scenario scenario, String BrowserType, String time) throws IOException {

        File f = new File(path);
        if (!f.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("LogOnur");
            Row row = sheet.createRow(0);


            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getName());
             cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(2);
            cell.setCellValue(BrowserType);
            cell = row.createCell(3);
            cell.setCellValue(time);

            try {

                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {


            FileInputStream inputStream = null;  // program ile dosya arasında bağlanıtı oluştu.
            Workbook workbook = null;
            try {

                inputStream  = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Sheet sheet = workbook.getSheetAt(0);

            int rowcount = sheet.getPhysicalNumberOfRows();

            Row newRow = sheet.createRow(rowcount);
            Cell newcell = newRow.createCell(0);


            Cell cell = newRow.createCell(0);
            cell.setCellValue(scenario.getName());
            cell = newRow.createCell(1);
            cell.setCellValue(scenario.getStatus().toString());
            cell = newRow.createCell(2);
            cell.setCellValue("BrowserType");
            cell = newRow.createCell(3);
            cell.setCellValue("DateTime");

            try{
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
           // System.out.println("işlem tamam.");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);

        }


        }



    }

    public static ArrayList<ArrayList<String>> getListData(String path, String sheetname, int columnnumber) {
        //String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        Workbook workbook = null;

        ArrayList<ArrayList<String>> result = new ArrayList<>();

        try {
            FileInputStream inputstream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputstream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet(sheetname);

        int rowCOunt = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCOunt; i++) {
            Row row = sheet.getRow(i);
            ArrayList<String> celllist = new ArrayList<>();
            for (int j = 0; j < columnnumber; j++) {

                celllist.add(row.getCell(j).toString());
            }

            result.add(celllist);
            System.out.println();
        }
        return result;
    }
}
