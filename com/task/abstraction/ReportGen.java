package com.task.abstraction;

 abstract class ReportGenerator{
	 String sr;
	 
	public ReportGenerator(String sr) {
		this.sr = sr;
	}
	
	abstract void generateContent();
	void openFile() {
		System.out.println("open file");
	}
	void writeContent() {
		System.out.println("write");
	}
	void saveFile() {
		System.out.println("save");
	}
	 public void generateReport() {
	        openFile();
	        generateContent();
	        writeContent();
	        saveFile();
	    }
}
class PDFReport extends ReportGenerator{
	String blockText;

	public PDFReport(String sr,String blockText) {
		super(sr);
		this.blockText = blockText;
	}
	public void generateContent() {
		System.out.println("Generating PDF content with block text.");	
	}
	void openFile() {
		System.out.println("open PDF file");
	}
	void writeContent() {
		System.out.println("write pdf file");
	}
	void saveFile() {
		System.out.println("save pdf file");
	}
}
//class ExcelReport extends ReportGenerator{
//	
//}
class HTMLReport extends ReportGenerator{
	String markupContent;

	public HTMLReport(String sr,String markupContent) {
		super(sr);
		this.markupContent = markupContent;
	}
	@Override
	void generateContent() {
		System.out.println(" \"Generating HTML content with markup.\"");
		
	}
	@Override
	void openFile() {
		System.out.println("open HTML file");
	}
	@Override
	void writeContent() {
		System.out.println("write HTML file");
	}
	@Override
	void saveFile() {
		System.out.println("save HTML file");
	}		
}
public class ReportGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportGenerator rg;
		rg=new PDFReport("Sample Report", "This is a sample block text.");
		rg.generateReport();
		System.out.println("------");
		rg=new HTMLReport("Sample Report", "<h1>Sample Report</h1> <p>This is a sample report.</p>");
		rg.generateReport();
//		System.out.println(rg.markupContent);
//		HTMLReport hr=new HTMLReport("Sample Report", "<h1>Sample Report</h1> <p>This is a sample report.</p>");
//		System.out.println(hr.markupContent);
		System.out.println("-----");
	}

}
