package  utils

import java.io.File

import scala.collection.JavaConversions._

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Cell
import java.io.FileInputStream
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.{Cell, Row, Workbook, Sheet}


trait ExcelReader {

  def inputFeed(fileInputStream: FileInputStream,
      fileName: String,
      sheetName: String,
      columnSize: Int,
      readFirstRow: Boolean = true): List[List[Cell]] = {
    
      //val excelExtension = "([^\\s]+(\\.(?i)(xls|xlsx))$)"
      //val excelData = if(fileName.matches(excelExtension)) {
      val phoneNumber = "\\d{10}"

      val xlsExtension = "([^\\s]+(\\.(?i)(xls))$)"
      val xlsxExtension = "([^\\s]+(\\.(?i)(xlsx))$)"
      val workbook:Workbook = if (fileName.matches(xlsExtension)) {
              new HSSFWorkbook(fileInputStream)
      } else {
              new XSSFWorkbook(fileInputStream)
      }
   
      val sheet = workbook.getSheet(sheetName)
      require(sheet != null)
      val listOfRow = sheet.rowIterator().toIterable.toList.map {
         row => row.cellIterator().toIterable.toList
      }
      if (readFirstRow) {
         listOfRow
      } else {
         listOfRow.tail
      }
  }
    

}
 
  
  

object ExcelReader extends ExcelReader  
  