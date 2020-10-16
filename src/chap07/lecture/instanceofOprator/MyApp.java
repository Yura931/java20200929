package chap07.lecture.instanceofOprator;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass(); // SuperClass 변수에 SubClass 인스턴스 할당
		
		// instanceof : 좌변이 참조변수, 우변이 타입
		// 결과 : boolean 타입으로 나옴 
		
		System.out.println(o1 instanceof SuperClass); // o1은 SuperClass의 instance라 할 수 있따.
		System.out.println(o1 instanceof SubClass);
		System.out.println(o1 instanceof SubClass2); // o1 == SubClass2라 할 수 없음.
		
		if (o1 instanceof SubClass) {
		SubClass o2 = (SubClass) o1;
		}
		
		if (o1 instanceof SubClass2) {
		SubClass2 o3 = (SubClass2) o1; // SubClass와 SubClass2는 같은 SuperClass를 상속받았지만 SubClass와 SubClass2는 같지 않기 때문에 강제형변환 되지 않음
		}
		
	}
}
