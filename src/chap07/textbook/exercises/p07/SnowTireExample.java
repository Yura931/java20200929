package chap07.textbook.exercises.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); // SnowTire 설계도에 의해 만들어 진 것.
		Tire tire = snowTire;
		
		System.out.println(tire == snowTire);
		
		snowTire.run();
		tire.run();
		
		// 변수명이 달라도 가리키고 있는 instance가 같음
	}



}
