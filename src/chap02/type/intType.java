package chap02.type;

public class intType {

	public static void main(String[] args) {
		// int : 4byte (32bit)
		// 최대 : 2147483647
		// 최소 : -2147483648
		
		int intValue = 2147483647;
		System.out.println(intValue);
		
		intValue++;
		System.out.println(intValue);
		
		intValue = -2147483648;
		System.out.println(intValue);
		
		// 정수 리터럴
		intValue = 2147483647; // 이 수 이상은 오류 남
		intValue = 2_147_483_647; // 10진법
		intValue = 017777777777; //8진법
		System.out.println(intValue);
		
		intValue = 0x7FFFFFFF; //16진법
		System.out.println(intValue);
	}
}
