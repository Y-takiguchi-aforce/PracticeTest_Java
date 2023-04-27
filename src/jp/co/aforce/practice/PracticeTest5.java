package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
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
			int month = calendar.get(Calendar.MONTH);
			
			if(month == 0) {
				System.out.println("冬物セール");
			}
			else if(1 <= month & month < 4) {
				System.out.println("春物を売る");
			}
			else if(month == 4) {
				System.out.println("春物セール");
			}
			else if(5 <= month & month < 7) {
				System.out.println("夏物を売る");
			}
			else if(month == 7) {
				System.out.println("夏物セール");
			}
			else if(month == 8) {
				System.out.println("秋物を売る");
			}
			else if(9 <= month & month <= 11) {
				System.out.println("冬物を売る");
			}
			else {
				System.out.println("不正な月です");
			}
			
			
		}
}
