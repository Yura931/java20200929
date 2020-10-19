package chap08.textbook.s080303;

import chap08.textbook.s080201.RemoteControl;

public class MyApp {
	public static void main(String[] args) {
		SmartTelevision o1 = new SmartTelevision();
		RemoteControl r1 = o1;
		Searchable s1 = o1;
		
		s1.search("daum");
//		s1.turnOn();
//		s1.turnOff();
		
		r1.turnOn();
		r1.turnOff();
		r1.setVolume(3);
//		r1.search("google");
	
	System.out.println(r1 instanceof RemoteControl);
	System.out.println(r1 instanceof Searchable); // 실제 instance가 어떤 것을 가르키고 있는지 중요
	System.out.println(s1 instanceof RemoteControl);
	
	}
}
