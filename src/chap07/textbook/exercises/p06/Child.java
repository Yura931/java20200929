package chap07.textbook.exercises.p06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("홍길동"); // 자기자신의 생성자 호출
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(string name) call");
	}
}
