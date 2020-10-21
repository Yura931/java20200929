package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name());
		System.out.println(e1.ordinal());
		
		MyEnum e2 = MyEnum.valueOf("VALUE3");
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2); // e1 에서 e2를 뺀 결과
		System.out.println(diff);
		
		System.out.println(e2.compareTo(e1)); // 결과에 따라 상위,하위에 정의가 됨
		
		MyEnum[] arr = MyEnum.values(); // MyEnum이 가질 수 있는 값을 배열로
		
		System.out.println(arr.length);
	}
}
