package steps;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.core.logging.Logger;

public class ExcelDataReader implements IDataReader {

	private final ExcelConfiguration config;
	private Logger logger;

	public ExcelDataReader(ExcelConfiguration config) {
		this.config = config;

	}

	// get the wb path
	private XSSFWorkbook getWorkBook() throws InvalidFormatException, IOException {
		return new XSSFWorkbook(new File(config.getFileLocation()));

	}

	// to get the sheet
	private XSSFSheet getSheetName(XSSFWorkbook wb) {
		return wb.getSheet(config.getSheetName());
	}

	// get the header of the sheet

	private List<String> getHeaders(XSSFSheet sheet) {
		List<String> headers = new ArrayList<String>();

		XSSFRow row = sheet.getRow(0);
		for (Cell cell : row) {
			headers.add(cell.getStringCellValue());
		}
		return Collections.unmodifiableList(headers);

	}

	public List<Map<String, String>> getAllrows() {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		try {

			XSSFWorkbook workBook = getWorkBook();
			XSSFSheet sheetName = getSheetName(workBook);
			data = getData(sheetName);
		} catch (Exception e) {
			logger.error(e, new Supplier<String>() {

				public String get() {
					// TODO Auto-generated method stub
					return String.format("Not able to read the excel", config.getFileName());
				}

			});
			return Collections.EMPTY_LIST;
		}

		// TODO Auto-generated method stub
		return Collections.unmodifiableList(data);
	}

	public List<Map<String, String>> getData(XSSFSheet sheet) {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		List<String> headers = getHeaders(sheet);
		int lastRowNum = sheet.getLastRowNum();
		for (int i = 0; i <= lastRowNum; i++) {

			Map<String, String> rowMap = new HashMap<String, String>();
			XSSFRow row = sheet.getRow(i);
			int headerIndex = 0;
			for (Cell cell : row) {
				String stringCellValue = cell.getStringCellValue();
				String header = headers.get(headerIndex);
				rowMap.put(header, stringCellValue);
				headerIndex++;

			}
			data.add(rowMap);
		}
		return Collections.unmodifiableList(data);
	}

	public Map<String, String> getData(XSSFSheet sheet, int index) {
		List<String> headers = getHeaders(sheet);
		Map<String, String> rowMap = new HashedMap<String, String>();
		XSSFRow row = sheet.getRow(index);
		int headerIndex = 0;
		for (Cell cell : row) {
			String stringCellValue = cell.getStringCellValue();
			String header = headers.get(headerIndex);
			rowMap.put(header, stringCellValue);
			headerIndex++;
		}
		return Collections.unmodifiableMap(rowMap);
	}

	public Map<String, String> singleRow() {
		Map<String, String> data = new HashedMap<String, String>();
		try {

			XSSFWorkbook workBook = getWorkBook();
			XSSFSheet sheetName = getSheetName(workBook);
			data = getData(sheetName, config.getIndex());
		} catch (Exception e) {
			logger.error(e, new Supplier<String>() {

				public String get() {
					// TODO Auto-generated method stub
					return String.format("Not able to read the excel", config.getFileName());
				}

			});
			return Collections.EMPTY_MAP;
		}

		// TODO Auto-generated method stub
		return Collections.unmodifiableMap(data);

	}

}
