package chap09.lecture.localClass;

public class LocalVariable {
	public static void main(final  String[] args) {
		int i = 1; // final 생략
		
		class LocalClass {
			void method1() {
//				System.out.println(i);
				System.out.println(args);
//			i += 1;
			}
		}
//		args = new String[3];
		i += 1;
	}
}
