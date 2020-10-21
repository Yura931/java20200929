package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
	
		MyEnum e1 = MyEnum.VALUE1;
		
		MyEnum e2 = MyEnum.MY_VALUE4; // 상수 사용과 비슷 ,new연산자 사용이 불가능하고, 정해진 instance만 사용이 가능하다.
		MyEnum e3 = MyEnum.MY_VALUE4;
		
		
		System.out.println(e2 == e3);
		System.out.println(e1.toString()); 
		
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum); // Enum 클래스, Object의 하위 클래스 Enum은 Object를 상속 받은 것,  
		System.out.println(e1 instanceof MyEnum); // MyEnum은 Enum을 상속받은 것
	}
}

class MyClass {
	
}