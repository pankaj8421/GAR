package j.core;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class daysback60 {
public static void main(String[] args) {
	Date today = new Date();
	Calendar cal = new GregorianCalendar();
	cal.setTime(today);
	cal.add(Calendar.DAY_OF_MONTH, -60);
	Date today60 = cal.getTime();
	System.out.println(today60);
	
}
	
	
}
