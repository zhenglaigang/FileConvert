package com.example.demo.eiceblue;

import com.spire.xls.FileFormat;
import com.spire.xls.Workbook;

/**
 * Excel转换近乎原格式转换，免费版本支持
 */
public class T01_ExcelToPdf {

    public static void main(String[] args) {
        //创建一个Workbook实例并加载Excel文件
        Workbook workbook = new Workbook();
        workbook.loadFromFile("C:/Users/Administrator-PC/Desktop/评审意见表格模板.xlsx");

        //设置转换后的PDF页面高宽适应工作表的内容大小
        workbook.getConverterSetting().setSheetFitToPage(true);

        //将生成的文档保存到指定路径
        workbook.saveToFile("C:/Users/Administrator-PC/Desktop/评审意见表格模板.pdf", FileFormat.PDF);
    }

}
