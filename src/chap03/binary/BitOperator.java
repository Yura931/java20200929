package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~ 반전(단항)
		// 2진법 비트를 바꿔주는(반전) 연산자
		int i = 10;
		int j = ~i;
		System.out.println(j);
//		0000 0000 0000 0000 0000 0000 0000 0000 1010
//		1111 1111 1111 1111 1111 1111 1111 1111 0101
		
		
		//이항 , 양 변이 integer 타입
		// & and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
		// | or : 같은 자리의 bit가 0인 경우만 0, 나머지 1
		// ^ xor : 같은 자리의 bit가 다를경우 1, 아니면 0
		// 피연산자 : integer
		//결과 : integer
		
		int a =45; // 00101101
		int b =25; // 00011001
		int c = a & b;
		// 00001001 = 9
		System.out.println(c);
		
		c = a | b;
		// 0011 1101 = 61
		System.out.println(c);

		c = a ^ b;
		// 0011 0100 = 52
		System.out.println(c);
		
		// bit shift 연산자 (밀어내거나 옮기는)
		// << : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움
		// >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Sinificant Bit)
		// >>> : 각 bit를 오른쪽으로 옮김,왼쪽은 0으로 채움
		
		int val = 3; //
		int res = val << 3;
		System.out.println(res);
		
		val = 98;
		res = val >> 2;
		System.out.println(res);
		
		val = -17;
	    res = val>>1;
	    System.out.println(res);
	    
	    val = 98;
	    res = val >>> 2;
	    System.out.println(res);
	    
	    val = -17;
	    res = val >>>1;
	    System.out.println(res);
		
	    //codingbat
	}
}
