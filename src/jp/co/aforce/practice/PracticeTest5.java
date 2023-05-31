package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	private static final int case1 = 0;

	public static void main(String[] args) {
			//練習問題2
			ArrayList<String> animals = new ArrayList<>();
			animals.add("犬");
			animals.add("猫");
			animals.add("うさぎ");
			animals.add("へび");
			//System.out.println(animals);
			
			//練習問題3
			String fav = "鹿";
			if (animals.contains(fav)) {
				System.out.println(fav + "はリストに含まれています");
			}
			else {
				System.out.println(fav + "はリストに含まれていません");
			}
			
			
			//練習問題4
			Calendar calendar = Calendar.getInstance();
			int month = calendar.get(Calendar.MONTH) + 1;
			//System.out.println(month);
//			if(month == 1) {
//				System.out.println("冬物セール");
//			}
//			else if(2 <= month & month < 5) {
//				System.out.println("春物を売る");
//			}
//			else if(month == 5) {
//				System.out.println("春物セール");
//			}
//			else if(6 <= month & month < 8) {
//				System.out.println("夏物を売る");
//			}
//			else if(month == 8) {
//				System.out.println("夏物セール");
//			}
//			else if(month == 9) {
//				System.out.println("秋物を売る");
//			}
//			else if(10 <= month & month <= 12) {
//				System.out.println("冬物を売る");
//			}
//			else {
//				System.out.println("不正な月です");
//			}
			
			String msg;
			switch(month) {
			
			case 1:
				msg = "冬物セール";
			break;
			case 2:
			case 3:
			case 4:
				msg = "春物を売る";
				break;
			case 5:
				msg = "春物セール";
				break;
				
			case 6:
			case 7:
				msg = "夏物を売る";
				break;
			case 8:
				msg = "夏物セール";
				break;
			case 9:
				msg = "秋物を売る";
				break;
			case 10:
			case 11:
			case 12:
				msg = "冬物を売る";
				break;
			default:
				msg = "不正な月です";
				break;
			}
			System.out.println(msg);
			
			
		}
}
