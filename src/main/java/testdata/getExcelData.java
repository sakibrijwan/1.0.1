package testdata;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Reading creadential.xls file
public class getExcelData {
    public String[][] getExcelData(String fileName, String sheetName) {
        String[][] arrayExcelData = null;
//        ClassLoader classLoader = getClass().getClassLoader();
//        System.out.println(classLoader.getResource(fileName).getPath());
        File file = new File(fileName);
//        File file = new File(classLoader.getResource(fileName).getFile());
        try {
            FileInputStream fs = new FileInputStream(file);
            Workbook wb = Workbook.getWorkbook(fs);
            Sheet sh = wb.getSheet(sheetName);

            int totalNoOfCols = sh.getColumns();
            int totalNoOfRows = sh.getRows();

            arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];

            for (int i = 1; i < totalNoOfRows; i++) {

                for (int j = 0; j < totalNoOfCols; j++) {
                    arrayExcelData[i - 1][j] = sh.getCell(j, i).getContents();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return arrayExcelData;
    }
}
