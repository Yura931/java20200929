package chap07.textbook.s070804;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //구현하지 못한 메소드 abstract 메소드로 사용
}
