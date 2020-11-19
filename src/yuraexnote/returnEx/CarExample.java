package yuraexnote.returnEx;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setGas(5); // setGas()메소드의 매개변수에 5 저장
		
		boolean gasState = car.isLeftGas(); // isLeftGas()메소드 호출 후 gasState변수에 저장
		if(gasState) { // gasState가 true면 car 클래스의 true를 리턴 한 out.println("gas가 있습니다.")가 실행
			System.out.println("출발합니다.");
			car.run(); // run() 메소드 호출 ,실행
		}
		
		if(car.isLeftGas()) {  // isLeftGas()메소드 호출 , run()메소드가 실행되면서 gas의 값이 0이 되었기 때문에 gas==0의 조건을 만족해 "gas가 없습니다"가 실행 됨
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요."); // if(gas==0) 조건문이 실행되어 false가 반환되었기 때문에 이 구문이 실행 됨
		}
	}
}
