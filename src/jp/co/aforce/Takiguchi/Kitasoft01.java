package jp.co.aforce.Takiguchi;

import java.math.BigDecimal;
public class Kitasoft01 {
	public static void main(String[] args) {
		//1-1
		System.out.println("Hello World");
		//1-2
		int a = 11;
		System.out.println("a=" + a);
		//1-3
		int x = 13;
		int y = 17;
		System.out.println("x=" + x +",y=" + y);
		//1-4
		int b = x + y;
		System.out.println(b);
		//1-5
		System.out.println(x * y);
		//1-6
		int c = 7;
		System.out.println(3 * c);
		System.out.println(c/2);
		//1-7
		int d = 3;
		int e = 7;
		int f = d;
		int d1 = e;
		System.out.println("d=" + e + ",e=" + f);
		//1-8
		int g = 19;
		int h = 23;
		int z = g * h;
		System.out.println(z);
		//1-9
		int i = 7;
		System.out.println(i*2);
		System.out.println(i*3);
		System.out.println(i*4);
		//1-10
		BigDecimal bd1 = new BigDecimal(2);
		BigDecimal result = bd1.pow(2);
		System.out.println(result);
		//1-11
		int j = 11;
		System.out.println(j % 3);
		//1-12
		int k = 19;
		k++;
		System.out.println(k);
		k--;
		System.out.println(k);
		
	}
}
