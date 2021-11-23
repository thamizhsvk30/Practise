package Mypages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) {
		
	
		String Input = "09:30 AM ";
		DateFormat df = new SimpleDateFormat("hh:mm aa");
		DateFormat outputformate = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		String output = null;
		try {
			date = df.parse(Input);
			output = outputformate.format(date);
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
