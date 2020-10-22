package chap13.lecture;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<>();
		MyClass2<Integer> o2 = new MyClass2<>();
//		MyClass2<Object> o3 = newMyClass2<>();  Number의 상위클래스인 Object는 사용 불가능
		
	}
}
