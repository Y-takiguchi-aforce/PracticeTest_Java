package jp.co.aforce.sample;

import java.util.Calendar;

public class SeigyoSample {
	private static final Calendar Calendar = null;

	public static void main(String[] args) {

		/*制御構文if
		int x = 99 ;
		if(x < 100) {
			System.out.println("xは100より小さい");
		}else if(x < 200){
			System.out.println("xは200より小さい");
		}else{
			System.out.println("xは100以上");	
		}

		練習問題⑥
		int value = 10;
		if (value == 0) {
			System.out.println("値は0です");
		} else if (value >= 1 && 5 >= value ) {
			System.out.println("値は1以上5以下です");
		} else {
			System.out.println("値は" + value + "です");
		}
		*/

		/*制御構文switch
		int x = 2;
		switch(x) {
		case 1:
			System.out.println("xの値は1です");
			break;  //break書き忘れてもエラー出ないので注意
		case 2:
			System.out.println("xの値は2です");
			break;
		default:
			System.out.println("xの値は1,2以外です");
			break;
		}
		
		練習問題⑦
		Calendar calendar = Calendar.getInstance();
		String dayOfWeek;
		
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "日";
			break;
		case 2:
			dayOfWeek = "月";
			break;
		case 3:
			dayOfWeek = "火";
			break;
		case 4:
			dayOfWeek = "水";
			break;
		case 5:
			dayOfWeek = "木";
			break;
		case 6:
			dayOfWeek = "金";
			break;
		default:
			dayOfWeek = "土";
			break;
		}
		System.out.println("今日は" + dayOfWeek + "曜日です");
		*/

		/*while文
		int x = 1;
		int amount = 0;
		while(amount < 10) {
			System.out.println( x + "を足します");
			amount = amount + x;
			x++;
		}
		System.out.println("合計は" + amount);

		練習問題⑧
		int x = 1;
		int san = 0;
		while (x < 11) {
			san = x * 3;
			x++;
			System.out.println(san);
		}

		別解
		int count = 1;
		while(count <= 30){
			if(count % 3 == 0) {
				System.out.println(count);
		}
		count++;
		}
		*/

		/*do while
		int x = 1;
		int amount = 1;
		do {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		}while(amount < 0);
		System.out.println("合計は"	+ amount);
		
		練習問題⑨
		int b = 1;
		int nibai = 0;
		do {
			nibai = b * 2;
			System.out.println(nibai);
			b++;
		}while(b < 5);
		
		別解
		int num = 2;
		do {
		System.out.println(num);
		num += 2 ;
		}while(num < 10);
		
		中身をif文で書くこともできる
		int c = 1;
		do {
			if(c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}while(c < 10);
		*/

		/*for文
		for(int i = 1; i <= 3; i++) {
			System.out.println("手順Qを実行:" + i + "回目");
		}
		
		練習問題⑩
		for(int i = 1; i <= 9; i++) {
			System.out.println("4×"+ i + "=" + (4*i));
		}
		*/

		/*繰り返す数が状況によって変わるfor
		String[]fruits = new String[3];
		fruits[0] = "リンゴ";
		fruits[1] = "オレンジ";
		fruits[2] = "ブドウ";
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println(fruits.length);
		
		練習問題⑪
		String[]youbi = {"日","月","火","水","木","金","土"};
		String[]week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for (int i = 0; i < youbi.length; i++) {
			System.out.println(youbi[i] + "曜日は英語では" + week[i] + "です");
		}
		*/

		/*拡張for
		HashSet<String>books = new HashSet<>();
		books.add("不思議の国のアリス");
		books.add("ヘンゼルとグレーテル");
		books.add("銀河鉄道の夜");
		for(String book:books) {
			System.out.println(book);
		}
		*/

		/*break
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}

		練習問題⑫
		int count = 0;
		while (true) {
			if (count == 5) {
				break;
			}
			count++;
		}
		System.out.println(count);
		*/
		
		/*continue
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}System.out.println("プログラムの終了");
		*/
		
		//練習問題⑬
		for(int i = 0; i <= 10; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		

	}
}
