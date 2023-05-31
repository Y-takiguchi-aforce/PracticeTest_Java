package jp.co.aforce.sample;

public class Praactice1 {
	public static void main(String[] arg) {
		int value = 100;
		value += 10;
		value --;
		System.out.println(value);
		
		String lastName = "瀧口";
		String firstName = "優美子";
		String myName = lastName + firstName;
		System.out.println(myName);
		
		String saying = "明日は明日の風が吹く";
		boolean result = saying.contains("風");
		System.out.println(result);
		
	}
}
