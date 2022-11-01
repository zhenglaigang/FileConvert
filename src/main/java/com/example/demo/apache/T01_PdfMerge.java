package com.example.demo.apache;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * apache 合并pdf
 */
public class T01_PdfMerge {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<InputStream> list = new ArrayList<>();
        list.add(new FileInputStream("C:/Users/Administrator-PC/Desktop/评审意见表格模板.pdf"));
        list.add(new FileInputStream("C:/Users/Administrator-PC/Desktop/第 七 批第二次绿色建材采信评审专家意见.pdf"));

        mergePDFbox(list, "C:/Users/Administrator-PC/Desktop/xxx.pdf");
    }

    private static void mergePDFbox(List<InputStream> list, String outputFile) throws FileNotFoundException {
        // 合并PDF文档法二
        File outFile = new File(outputFile);
        PDFMergerUtility merger = new PDFMergerUtility();
        list.forEach(merger::addSource);
        merger.setDestinationStream(new FileOutputStream(outFile));
//        merger.setDestinationFileName(outFile.getName());
        try {
            // 合并PDF
            merger.mergeDocuments(null);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}



