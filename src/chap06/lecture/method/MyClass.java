package chap06.lecture.method;

public class MyClass {
	int var1;
	
	// 메소드 : 이름이 있는 코드 블럭
	// 메소드 이름: lowerCamelCase 변수명 작성 규칙과 같음
	// 메소드 파라미터 : 코드 블럭 안에서 사용되는 값을 저장 / ()안에 들어가는 값, 변수의 일종 , 변수명과 타입을 붙여줄 수 있음
	//					 메소드 호출할 떄 값 할당
	// 메소드 리턴타입 : 메소드가 반환(return)해야 하는 값의 타입
	
	void myMethod() {  // 실행되는 코드를 가지고 있는 블럭 , 이름 MyMethod , 기능을 가지고있기 때문에 statement를 가지고 있음.
		System.out.println("마이 메소드 실행");
		System.out.println(var1); // instance가 각각 가지고 있는 정보
	
	}
	
	void myMethod2(int param) { // 파라미터를 정의해두었기 때문에 꼭 값을 넣어줘야 함
		System.out.println("마이 메소드2 실행");
		System.out.println(param);
		System.out.println(param+var1);
	}
	
	void myMethod3(int param, int param2) {
		
	}
}	
