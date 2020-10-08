package chap05.exercises;

import java.util.Scanner;

public class Exercise09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("입력>");
		String str = scanner.nextLine(); //입력한 값이 String으로 str에 저장
		int val = Integer.valueOf(str); // 입력과 동시에 String이 int로 변환 , 입력 후 엔터를 누르면 int로 변환 된 상태이기 때문에 string 입력 불가
		
		System.out.println("출력>");
		System.out.println(str);  //입력받은 값의 타입을 변환시키고 싶을 때
		System.out.println(val);
		
		System.out.println("정수입력>");
		val = scanner.nextInt();
		
		System.out.println("정수출력>");
		System.out.println(val);
	}	
}
