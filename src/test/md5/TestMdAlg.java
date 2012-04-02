package test.md5;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.stream.JsonWriter;


public class TestMdAlg {

    private static String extractServiceCode(String pathInfo) {
    	String serviceCode = "";
    	
    	if (pathInfo == null || pathInfo.equals("") || pathInfo.length() < 2) {
    		return serviceCode;
    	}
    	
		Pattern pattern = Pattern.compile("^/.*?/(.*?)([/?]|$)");
		Matcher matcher = pattern.matcher(pathInfo);
		
		if (matcher.find()) {
			serviceCode = matcher.group(1).trim();
		}
		
		return serviceCode;
    	
    }
    
    private static String extractSubServiceCode(String pathInfo) {
    	String subServiceCode = "";
    	
    	if (pathInfo != null) {
			Pattern pattern = Pattern.compile("^/.*?/.*?/(.*?)([/?]|$)");
			Matcher matcher = pattern.matcher(pathInfo);
			
			if (matcher.find()) {
				subServiceCode = matcher.group(1).trim();
			}
    	}
    	
    	return subServiceCode;
    }
    
    public static void main(String args []) throws Exception {
    	JsonWriter wr; wr.
    }
	
	private String calcMD5(String text) throws Exception {
		
		MessageDigest md5 = MessageDigest.getInstance("md5");
		md5.reset();
		
		md5.update(text.getBytes("utf-8"), 0, text.length());
		byte[] hash = md5.digest();
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			int[] hex = new int[2];
			for (int j = 0; j < 2; j++) {
				int c = hash[i] & 0xF;
				hex[j] = c < 10 ? '0' + c : 'a' + (c - 10);
				hash[i] = (byte) (hash[i] >>> 4);
			}
			result.append((char)hex[1]);
			result.append((char)hex[0]);
		}
		
		System.out.println("RESULT = " + result.toString());
		
		return result.toString();
		
	}

}
