package test.thing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestThing {
	
	public static void main(String [] args) throws Exception {
		/*
		GregorianCalendar cld = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"), Locale.US);
		
		Date ourDate = new Date();
		
		System.out.println("TIME ZONE OFFSET = " + ourDate.getTimezoneOffset());
		System.out.println("CALENDAR TIME ZONE OFFSET = " + Calendar.getInstance().get(Calendar.ZONE_OFFSET));
		
		
		System.out.println("Out date = " + ourDate);
		
		cld.setTime(ourDate);
		
		System.out.println("Their time = " + cld);
		System.out.println("### = " + cld.get(Calendar.HOUR));
		*/
		
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.US);
		
		//String usTime = sdf.format(new Date());
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US);
		
		df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		
		String usTime = df.format(new Date());
		
		System.out.println("US_TIME = " + usTime);
		*/
		
//		try {
//			int a = 1/0;
//		} catch (Exception e) {
//			System.out.println("EXCEPTION TO STRING = " + e);
//			System.out.println("EXCEPTION GET MESSAGE = " + e.getMessage());
//			e.printStackTrace();
//		}
		
//		OutputStream out = null;
//		
//		try {
//			out = new FileOutputStream(new File("C:\\cvc\\TestTxt\\src\\test.txt"));
//			
//			int a = System.in.read();
//			System.out.println("A = " + a);
//			
//			out.write(49);
//			
//		} finally {
//			if (out != null) {
//				out.close();
//			}
//		}
		
//		List processedBatchIds = new ArrayList();
//		
//		List batchIds = new ArrayList();
//		
//		batchIds.add("id1");
//		batchIds.add("id2");
//		batchIds.add("id3");
//		
//		if (processedBatchIds.containsAll(batchIds)) {
//			System.out.println("CONTAINS");
//		} else {
//			System.out.println("NONE");
//		}
		
		// "\\b(https?://)?(www\\.)?(.[\\w\\.]+)\\b"
		// "\\b[^\\S.]+\\b"
		// "\\b\\S+(\\.\\S)+\\b"
		
		String test = "The sun is  <a>shine.Ru</a> is 23 december. ";
		Pattern pattern = Pattern.compile("\\b\\S+(\\.\\S+)+\\b", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(test);
		matcher.find();
		
		System.out.println("URL = " + matcher.group(0));
		//String protocol = matcher.group(1) == null ? "http://" : matcher.group(1);
		//System.out.println(protocol + "www." + matcher.group(3));
		
		
	}
}
