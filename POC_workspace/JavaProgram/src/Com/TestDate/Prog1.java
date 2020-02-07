package Com.TestDate;

import java.sql.Date;
import java.util.Calendar;
import java.time.LocalDateTime;

public class Prog1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2017-07-18T11:58:57.000+0000
		//SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")

		long d = System.currentTimeMillis();
		Date date = new Date(d);
		System.out.println("1 "+date);
		System.out.println("2 "+date.getTimezoneOffset());
		System.out.println("3 "+date.toGMTString());
		System.out.println("4 "+date.getTime());
		System.out.println("5 "+date.getDate());
		
		LocalDateTime now = LocalDateTime.now();				
		
		System.out.println("6 "+now);
		now  = now.plusMonths(2);
		System.out.println("6- "+now);
		//now.plusMonths(months)
		//dummy statement 
		//dummy statement2 
		//dummy statement3
		
		/*
		 * date = new Date(Calendar.getInstance().getTime().getTime());
		 * System.out.println("7 "+date);
		 * 
		 * //Date(int year, int month, int date) date = new
		 * Date(now.getYear(),now.getMonthValue(),now.getDayOfMonth());
		 * System.out.println("8 "+date);
		 * 
		 * now= now.plusMonths(2); date = new
		 * Date(now.getYear(),now.getMonthValue(),now.getDayOfMonth());
		 * System.out.println("9 "+date);
		 */
		System.out.println("10 "+date);
		date.setMonth(date.getMonth()+2);
		System.out.println("11 "+date);
		//test
		//test 2
		//test 3
		//test 4
		//test 5
		//test 6
		

	}

}
