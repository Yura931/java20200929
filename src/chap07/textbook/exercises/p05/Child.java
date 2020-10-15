package chap07.textbook.exercises.p05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) { 
		super(name); // 명시적으로 부모클래스의 생성자를 호출해 주어야 함
//		this.name = name;
		this.studentNo = studentNo;
	}

}
