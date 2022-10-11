package com.example.demo.eiceblue;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

/**
 * 需要指定证书，不可用
 */
public class T02_WordToPdf {

    public static void main(String[] args) {
        //实例化Document类的对象
        Document doc = new Document();

        //加载Word
        doc.loadFromFile("D://sign/test.docx");

        //保存为PDF格式
        doc.saveToFile("D://sign/WordToPDF.pdf", FileFormat.PDF);
    }
}
