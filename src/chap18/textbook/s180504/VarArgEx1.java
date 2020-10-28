package chap18.textbook.s180504;

public class VarArgEx1 {
	public static void main(String[] args) {
		method();
		method(1);
		method(1, 2);
	}
	
	public static void method(int... nums) { // 값을 여러개 넣을 수 있는 파라미터
		System.out.println("method 실행");
		System.out.println(nums.length);
		
		for (int i = 0; i < nums.length; i++) { 
			System.out.println(nums[i]);
		}
	}
}
