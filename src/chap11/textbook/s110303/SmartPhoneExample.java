package chap11.textbook.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		SmartPhone iphone = new SmartPhone("apple", "ios");
		
		
		String strObj1 = myPhone.toString();
		System.out.println(strObj1);
		System.out.println(myPhone);
		System.out.println(iphone);
		
	}
}
