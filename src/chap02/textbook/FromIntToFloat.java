package chap02.textbook;

public class FromIntToFloat {

	public static void main(String[] args) {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		//같은값을 실수타입에 넣었다 int로 강제 형변환
		int result = num1 - num2;
		System.out.println(result);
	}
}
