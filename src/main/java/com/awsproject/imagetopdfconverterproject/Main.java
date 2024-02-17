package com.awsproject.imagetopdfconverterproject;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class Main {

	public static void main(String[] args) {
		
		Document document = new Document();
	    String input = "c:/temp/capture.png"; // .gif and .jpg are ok too!
	    String output = "c:/temp/capture.pdf";
	    try {
	      FileOutputStream fos = new FileOutputStream(output);
	      PdfWriter writer = PdfWriter.getInstance(document, fos);
	      writer.open();
	      document.open();
	      document.add(Image.getInstance(input));
	      document.close();
	      writer.close();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	}


}
