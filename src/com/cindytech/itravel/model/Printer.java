package com.cindytech.itravel.model;

public class Printer {

	private String printername;
	private String paperSize;
	
	public Printer() {}
			
	public Printer(String printeName, String paperSize) {
		super();
		this.printername = printeName;
		this.paperSize = paperSize;
	}

	public String getPrinterName() {
		return printername;
	}

	public void setPrinterName(String printeName) {
		this.printername = printeName;
	}

	public String getPaperSize() {
		return paperSize;
	}

	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	
}
