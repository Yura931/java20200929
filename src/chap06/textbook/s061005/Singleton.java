package chap06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	// 외부에서 사용하지 못하도록 막아놓은 키워드
	static Singleton getInstance() { //자기자신의 static 필드를 리턴해주는 일을 함
		return singleton;
	}
	}
