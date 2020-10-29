package chap14.textbook.s140302;

@FunctionalInterface  // 추상메소드가 하나인 인터페이스에 붙일 수 있는 어노테이션
public interface MyFunctionalInterface {
	public void method();
//	public void method2();  추상메소드가 두개가 되면 FunctionalInterface가 붙을 수 없음
}
