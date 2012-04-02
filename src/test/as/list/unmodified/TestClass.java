package test.as.list.unmodified;

import java.net.URLDecoder;
import java.util.Date;

public class TestClass {

	public static String decode(String value) throws Exception {
		return value == null || value.trim().equals("") ? 
					value : 
					URLDecoder.decode(value, "UTF-8");
	}
    
	public static void main(String ... args) throws Exception {
		System.out.println(String.format("%12.4s", "123456789"));
	}
	
	public static void main3(String ... args) throws Exception {
		System.out.println(decode("+380968263054"));
	}
	
	public static void main2(String [] args) throws Exception {
		System.setProperty("user.timezone", "GMT+2");
		
		//TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		
		long testTime = 1293526260000L; // 10:51
		
		Date date = new Date(testTime);
		
		System.out.println(date.toGMTString());// 8:51
	}
	
	/**
	 * @param args
	 */
	public static void main1(String[] args) throws Exception {
		//0408661A 333134383932322E34383731353730333636 00296A;
		//0408661A 3231303334383032322E3134323039303035 00C007
		//04086900
		//04082209 302E3030
		
		//0408220A 31312E3639 11.69
		
		// 210348022.14209005
		
		// 0x 0408661A 33 31 34 38 39 32 32 2E 34 38 37 31 35 37 30 33 36 36 00296A;
		// 				3  1  4  8  9  2  2  .  4  8  7  1  5  7  0  3  6  6
		// 3148922.4871570366
		// 3148922.4871570366
		
		//3148922
		
		//byte [] arr = {0x04,0x08,0x66,0x1A,   0x33,0x31,0x34,0x38,0x39,0x32,0x32,0x2E,0x34,0x38,0x37,0x31,0x35,0x37,0x30,0x33,0x36,0x36,   0x00,0x29,0x6A };
		
		byte [] arr = {0x32,0x31,0x30,0x33,0x34,0x38,0x30,0x32,0x32,0x2E,0x31,0x34,0x32,0x30,0x39,0x30,0x30,0x35};
		
		System.out.println(new String(arr));
		
		
	}

}
