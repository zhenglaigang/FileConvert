package com.example.demo.eiceblue;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfDocumentBase;
import com.spire.pdf.widget.PdfPageCollection;

public class T03_PdfMerge {
    public static void main(String[] args) {

        //获取要合并的PDF文档的路径
        String[] files = new String[] {
                "C:/Users/Administrator-PC/Desktop/test.pdf",
                "C:/Users/Administrator-PC/Desktop/使用文档.pdf"};

        //合并这些文档并返回一个 PdfDocumentBase 类对象
        PdfDocumentBase doc = PdfDocument.mergeFiles(files);


        //保存合并后的文档
        doc.save("C:/Users/Administrator-PC/Desktop/合并PDF文档.pdf", FileFormat.PDF);

        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("C:/Users/Administrator-PC/Desktop/合并PDF文档.pdf");
        pdf.getPages().add();
        pdf.getPages().remove(pdf.getPages().get(pdf.getPages().getCount()-1));
        pdf.saveToFile("C:/Users/Administrator-PC/Desktop/合并PDF文档1.pdf");
        pdf.close();
    }
}
