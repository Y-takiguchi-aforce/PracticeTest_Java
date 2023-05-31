package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice_230424 {
	public static void main(String[] arg) {
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);
		calendar.clear();
		calendar.set(2000,6,11);  //シンプルに6でいい
		Date birthday = calendar.getTime();
		System.out.println(birthday);
		
		calendar.clear();
		calendar.set(2020,0,2,10,20,30);
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println(calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.HOUR_OF_DAY,-5);
		System.out.println(calendar.getTime());
		
		calendar.clear();
		calendar.set(2004,6,24);
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日(E) HH時:mm分:ss秒");
		String formattedDate = format.format(calendar.getTime());
		System.out.println(formattedDate);
			}
}
