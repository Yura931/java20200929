package chap10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행중1");
		
		String data = null;
		
		if (data != null) {
		System.out.println(data.toString());
		}
		System.out.println("프로그램 실행중2");
	
	// 객체가 없는 상태에서 객체를 사용하려 했기 때문에 예외가 발생하는 것.
	}
	
}
