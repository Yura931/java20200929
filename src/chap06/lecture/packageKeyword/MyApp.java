package chap06.lecture.packageKeyword;

import java.util.Scanner;
import java.lang.String;// java.lang 패키지는 생략가능
import java.util.*; // *로 모두 임폴트 시킬 수 있음

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 
		= new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in); //원래는 이렇게 사용해야함
		Scanner s2 = new Scanner(System.in);
				
		java.lang.String str = "java"; // 다른패키지의 클래스를 사용하겠다고 선언할 수 있음
		String str2 = "css";
	
  //ctrl + shift + o = 필요한 패키지 자동 입력	
	}
	
	
}
