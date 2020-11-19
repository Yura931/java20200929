package yuraexnote.methodEx;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = com.sum1(values1);
		System.out.println(result1);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = com.sum2(1,2,3); // ...변수를 사용한 메소드 호출 시 {} 없이, 리스트로 나열해 주면 된다.
		System.out.println(result3);
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println(result4);
	}
}
