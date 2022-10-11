package com.example.demo.poi;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class POIMain {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D://sign/test.docx");
        XWPFDocument xwpfDocument = new XWPFDocument(fileInputStream);
        PdfOptions pdfOptions = PdfOptions.create();
        FileOutputStream fileOutputStream = new FileOutputStream("D://sign/WordToPDF.pdf");
        PdfConverter.getInstance().convert(xwpfDocument,fileOutputStream,pdfOptions);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
