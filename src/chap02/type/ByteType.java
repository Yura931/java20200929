package chap02.type;

public class ByteType {

	public static void main(String[] args) {
		// byte : 정수형 (양수, 음수, 0)
		// 크기 : 1byte (8bit 8개의 0,1자릿수를 가지고 있음)
		
		//-128 : 1000 0000
		//	   :
		// -3 : 1111 1101			
		// -2 : 1111 1110
		// -1 : 1111 1111
		
		// +1
		
		//		1 0000 0000
		
		// 0 : 0000 0000
		// 1 : 0000 0001
		// 2 : 0000 0010
		//   :
		// 127 : 0111 1111 양수로 표현할 수 있는 가장 큰 수
		
		// 앞자리 0 -> 0또는 양수
		// 앞자리 1 -> 음수
		
		// +1
		
		// -128	: 1000 0000

		
		byte byteValue;
		
		byteValue = 0;
		
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
		byteValue = 128;
		
		byteVAlue++;
		System.out.println(byteValue);
		
	}
}
