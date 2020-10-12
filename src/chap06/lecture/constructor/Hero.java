package chap06.lecture.constructor;

public class Hero {
	String name;
	int power; //instance
	
	public Hero(String name, int power) {
		this.name = name;
		this.power = power;
	}
	
	public Hero(String name) {
		this(name, 100);
	}
	// 파라미터있는 생성자를 사용하였기 때문에 파라미터없는 생성자는 사용할 수 없음.
	// 여러사람과 공유해야 하는 코드라면 field와 같은 이름 사용, 
	// 그냥사용하면 parameter를 가르키기 때문에 instance를 가르키는 this라는 키워드 사용 , 앞으로 만들어질 instance를 ..?
}
