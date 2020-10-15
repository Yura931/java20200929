package chap07.textbook.s070401;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); // 설계도 다시 정의 한 instance
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}
