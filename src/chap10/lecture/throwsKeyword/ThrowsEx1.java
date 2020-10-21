package chap10.lecture.throwsKeyword;

import java.io.FileNotFoundException;

public class ThrowsEx1 { // main() 메소드에서도 throws 키워드를 사용해서 예외를 떠넘길 수 있다, 최종적으로 JVM이 예외처리를 하게 된다. 
	public static void main(String[] args) throws ClassNotFoundException {
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		method3();
	}
	
	public static void method3() throws ClassNotFoundException, FileNotFoundException{
		Class.forName("java.lang.String");
		FileReader fr = new FileReader("file.txt");
	}
	
}
