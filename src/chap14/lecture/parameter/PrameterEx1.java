package chap14.lecture.parameter;

public class PrameterEx1 {
	public static void main(String[] args) {
		MyInterface1 o1 = (int a) -> System.out.println(a);
		//파라미터가 있는 메소드이기 때문에 파라미터 명시 해 주어야 함
		o1.method(9);
		
		MyInterface1 o2 = (i) -> System.out.println(i);
		o2.method(3); //타입명도 생략 가능, 인터페이스를 통해 유추 가능
		
		MyInterface1 o3 = x -> System.out.println(x);
		o3.method(10);
		}
		public static void method1(int x) {
			System.out.println(x);
		}
	}

