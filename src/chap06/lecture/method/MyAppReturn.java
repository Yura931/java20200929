package chap06.lecture.method;

public class MyAppReturn {
	public static void main(String[] args) {
		MyClassReturn o1 = new MyClassReturn();
		o1.method1();
		o1.var1 = 5;
		int v = o1.method2(); // return 오른쪽 값으로 치환 됨 . 우리눈에 보이지는 않음 .., 변수에 담아 출력해보면 알 수 있음.
		
		System.out.println(v);
	}
}
