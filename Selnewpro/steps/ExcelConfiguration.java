package steps;

import java.util.Objects;

public class ExcelConfiguration {

	private final String fileLocation;	
	private final String fileName;
	private final String sheetName;
	private int index = -1;

	private ExcelConfiguration(String fileLocation, String fileName, String sheetName, int index) {
		this.fileLocation = fileLocation;
		this.fileName = fileName;
		this.sheetName = sheetName;
		this.index = index;

	}

	// As constructor is private..static method helps to call those methods


	public String getFileLocation() {
		return fileLocation;
	}

	public String getFileName() {
		return fileName;
	}

	public String getSheetName() {
		return sheetName;
	}

	public int getIndex() {
		return index;
	}



	public static class ExcelConfigurationBuilder {
		private String fileLocation;
		private  String fileName;
		private  String sheetName;
		private int index = -1;

		
	public ExcelConfigurationBuilder setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
		return this;
	}

	public ExcelConfigurationBuilder setFileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public ExcelConfigurationBuilder setSheetName(String sheetName) {
		this.sheetName = sheetName;
		return this;
	}

	public ExcelConfigurationBuilder setIndex(int index) {
		this.index = index;
		return this;
	}
	
	
	public ExcelConfiguration build() {
	 Objects.requireNonNull(fileLocation);
	 Objects.requireNonNull(fileName);
	 Objects.requireNonNull(sheetName);
	 Objects.requireNonNull(index);
	 return new ExcelConfiguration(fileLocation,fileName,sheetName,index);
	 
	}
	
	
	
	
	

}
}