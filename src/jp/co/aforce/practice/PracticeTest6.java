package jp.co.aforce.practice;

public class PracticeTest6 {
	public static void main(String[] args) {
		//練習問題1
		int fortune = new java.util.Random().nextInt();
		{
			switch (fortune) {
			case 1:
				System.out.println("吉です");
				break;
			case 2:
				System.out.println("中吉です");
				break;
			case 3:
				System.out.println("大吉です");
				break;
			default:
				System.out.println("凶です");
				break;
			}
		}

		//練習問題2
		int x = 1;
		while (x <= 100) {
			if (x % 7 == 0) {
				System.out.print(x + ",");
			}
			x++;
		}
		System.out.println();

		
		//練習問題3
		for (int y = 1; y <= 9; y++) {
			for (int z = 1; z <= 9; z++) {
				int answer = y * z;
				System.out.print(" ");
				if (answer < 10) {
					System.out.print(" ");
				}
				System.out.print(answer);
			}
			System.out.println();
		}

	}

}
