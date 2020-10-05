package chap03.textbook;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String input = "3.14";
		Double v = Double.valueOf(input); // double 타입으로 변환해주는 method
//		Double v = (double) (input); 불가능한 casting
		// 기본 타입으로 casting 불가능
		
		System.out.println(v);
		
				
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {
			val = 0.0;
		}
		
		currentBalance += val; // "NaN" + 10000.0 문자열과 수를 더한 값은 문자열이 나옴 = "NaN"
		System.out.println(currentBalance);
		
//		double 타입 사용시 NaN과 Infinity가 나올 수 있으므로 주의해서 사용
	}
}
