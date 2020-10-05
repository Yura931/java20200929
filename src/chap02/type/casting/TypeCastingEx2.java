package chap02.type.casting;

public class TypeCastingEx2 {

	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue;
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
//		int intValue3 = intValue + doubleValue;
		double doubleValue2 = intValue + doubleValue;
		
		// 정수형의 연산결과는 int 
		short shortValue1 = 3;
		short shortValue2 = 5;
		
//		short shortValue3 = shortValue1 + shortValue2;
//      short + short 타입의 연산 결과는 항상 int로 나옴 (long 제외)
		int intValue4 = shortValue1 + shortValue2;
		
	}
}
