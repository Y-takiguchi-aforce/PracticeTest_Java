package jp.co.aforce.sample;

public class CollectionSample {
	public static void main(String[] args) {
		/*
		//コレクションの作成
		 
		 
		//リスト
		ArrayList<String>fruits = new ArrayList<>();
		//要素の追加
		fruits.add("りんご");
		fruits.add("みかん");
		System.out.println(fruits);
		//追加位置を指定できる
		fruits.add(1,"ぶどう");
		System.out.println(fruits);
		//要素の削除
		/*fruits.remove(0);
		System.out.println(fruits);*/
		//要素の参照
		/*
		String fruit = fruits.get(1);
		System.out.println(fruit);
		//要素の変更
		fruits.set(1, "メロン");
		System.out.println(fruits);
		*/

		/*練習問題①
		ArrayList<String> colors = new ArrayList<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄色");
		colors.add("オレンジ");
		colors.add("緑");
		colors.add("ピンク");
		colors.add("紫");
		String pink = colors.get(5);
		System.out.println(pink);
		colors.remove(1);
		colors.add(2, "水色");
		//System.out.println(colors);
		System.out.println(colors.get(1));
		colors.set(6, "白");
		colors.add(0, "黒");
		System.out.println(colors.get(6));
		*/
		
		/*
		//セット
		HashSet<String>fruits = new HashSet<>();
		System.out.println(fruits.add("りんご"));
		System.out.println(fruits.add("みかん"));
		System.out.println(fruits.add("ぶどう"));
		System.out.println(fruits);
		//要素の削除
		fruits.remove("ぶどう");
		System.out.println(fruits);
		
		
		//練習問題②
		HashSet<String>momotaro = new HashSet<>();
		momotaro.add("桃太郎");
		momotaro.add("サル");
		momotaro.add("犬");
		momotaro.add("キジ");
		momotaro.add("犬");
		momotaro.add("きびだんご");
		momotaro.add("きびだんご");
		System.out.println(momotaro);
		*/
		
		
		/*
		//マップ
		HashMap<String,String>members = new HashMap<>();
		System.out.println(members.put("naka@s.jp", "中垣"));
		System.out.println(members.put("haya@s.jp", "林"));
		System.out.println(members);
		System.out.println(members.put("naka@s.jp", "中原"));
		System.out.println(members);
		//要素の削除
		System.out.println(members.remove("haya@s.jp"));
		System.out.println(members);
		members.put("haya@s.jp", "林"); //再追加しておいた
		//要素の取得
		System.out.println(members.get("naka@s.jp"));
		String member = members.get("haya@s.jp");
		System.out.println(member);
		
		//練習問題③
		HashMap<String,String>shain = new HashMap<>();
		System.out.println(shain.put("A001", "田中太郎")); //コンソール出力しなくてもいい
		System.out.println(shain.put("A002", "佐藤次郎"));
		System.out.println(shain.put("A003", "山田花子"));
		System.out.println(shain.put("A004", "佐藤次郎"));
		shain.remove("A003");
		shain.put("A004", "高橋三郎");
		System.out.println(shain);
		
		
		//配列
		String[] fruits = new String[100];
		System.out.println(fruits);
		
		String[] singo = {"赤","黄","青"};
		System.out.println(singo[0]);
		singo[2]="緑";
		System.out.println(singo[2]);
		
		//練習問題④
		int[] number = {1,2,3,4,5};
		System.out.println(number[4]);
		*/
	}
}
