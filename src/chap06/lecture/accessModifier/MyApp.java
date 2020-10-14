package chap06.lecture.accessModifier;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		System.out.println(o1.var1);
		System.out.println(o1.var2);
//		System.out.println(o1.var3); var3은 private이기 때문에 사용 불가능
		
	}
}
