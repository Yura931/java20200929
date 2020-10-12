package chap05.textbook;

public class MainStringArrayArgument {
	public static void main(String[] args) { //명령을 내릴때 제일 먼저 실행 되는 부분 parameter로 String 배열 타입을 받고 있음. // main method에 값을 넣는 방법.
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); // valuOf와 함께 많이 쓰이는 method
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
