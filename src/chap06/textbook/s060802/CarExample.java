package chap06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		myCar.setGas(5);
		myCar2.setGas(7); //Car의 setGas(); 메소드 호출
		System.out.println(myCar.gas);		
		System.out.println(myCar2.gas);		
		
				boolean gasState = myCar.isLeftGas();  //Car의 isLeftGas() 메소드 호출
				if(gasState) {
					System.out.println("출발합니다.");
					myCar.run();  //Car의 run() 메소드 호출
				}
				
				if(myCar.isLeftGas()) {  //Car의 isLeftGas() 메소드 호출
					System.out.println("gas를 주입할 필요가 없습니다.");
				} else {
					System.out.println("gas를 주입하세요");
				}
	}
}
