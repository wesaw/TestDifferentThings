package test.thing.xls;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class TestXlsRead {
	
	public static void main(String [] args) throws Exception {
		InputStream inp = new FileInputStream("c:\\cvc\\xls\\workbook.xls");
		HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));
		
		/*
		ExcelExtractor extractor = new ExcelExtractor(wb);

		extractor.setFormulasNotResults(true);
		extractor.setIncludeSheetNames(false);
		String text = extractor.getText();
		*/

		System.out.println("TEXT = " + wb);
		
	}
	
}
