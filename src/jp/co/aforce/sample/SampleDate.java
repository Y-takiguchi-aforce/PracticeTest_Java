package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SampleDate {
	public static void main(String[] args) {
		
		//現在の日付を取得する
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date today = calendar.getTime();
		System.out.println(today);*/
		
		//指定した日付を取得する
		/*Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(2023, 4,23);
		Date today = calendar.getTime();
		System.out.println(today);*/
		
		//練習問題４
		/*Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);
		
		calendar.clear();
		calendar.set(2000,7-1,11);  //シンプルに6でいい
		Date birthday = calendar.getTime();
		System.out.println(birthday);*/
		
		//フィールドの取得
		/*Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(2000, 6,11,11,33,50);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hourOfDay);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		System.out.println(calendar.get(Calendar.YEAR));*/
		
		//フィールドの変更
		/*Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1984,11,26,11,33,50);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.SECOND, 00);
		System.out.println(calendar.getTime());*/
		
		//日付の計算
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH, -6);
		System.out.println(calendar.getTime());*/
		
		//タイムゾーン
		/*Calendar calendar = Calendar.getInstance();
		System.out.println("日本の時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です。");
		calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); //setTimeZoneは時差の足し引きをしているだけで、取得した時間自体は変わらない
		System.out.println("ロサンゼルスの時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です。");*/
		
		//日付を文字列に変換する、ロケール
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MMM/dd(EEEE) HH:mm:ss", new Locale("en", "US"));
		String formattedDate = format.format(calendar.getTime());
		System.out.println(formattedDate);
		
		
	}
}
