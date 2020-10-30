package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () -> {
			int ouuterField = 3;
			System.out.println("익명 클래스의 객체 (local class)");
			System.out.println(this);
			System.out.println(NestedEx2.this.outterField); // 감싸고 있는 클래스의 필드나 메소드를 사용 할 때 클래스 명과 this라는 키워드 사용
		};
	}
	public static void main(String[] args) {
		
	}
}
