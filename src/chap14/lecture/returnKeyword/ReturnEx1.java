package chap14.lecture.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
	
		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		};
		o1.method(3);
		
		MyInterface o2 = x -> { return x*2;};  //return키워드는 statement가 하나뿐이여도 중괄호가 있어야 하는 것 같네요 ..
		o2.method(10);
		
		MyInterface o3 = a -> a * 2;
		o3.method(20);  //return키워드도 생략 가능 컴파일러가 알아서 인식해서 리턴해줌
	}
}