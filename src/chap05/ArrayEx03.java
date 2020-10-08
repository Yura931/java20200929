package chap05;

public class ArrayEx03 {
	public static void main(String[] args) {
		int a = mymethod(3);
		System.out.println(a);
		
		a= mymethod(4); // return받은 4를 a에 할당
		System.out.println(a);
		
		a = mymethod(50);
		System.out.println(a);
		
		int[] arr1 = new int[] {9, 8, 7}; //arr1 instance 참조값이 mymethod2(int[]arr)로 넘어감
		a = mymethod2(arr1);
		System.out.println(a);
		
		int[]arr2 = new int[] {99, 88, 77};
		a = mymethod2(arr2);
		System.out.println(a);
		
		a = mymethod2(new int[] {22, 33, 44}); //instance 참조값을 넣거나, instance 참조값을 저장한 변수를 넣거나;
		System.out.println(a);
	}	
	
								//mymethod2(int배열 parameter 넣어줘야 함)
	public static int mymethod2(int[]arr) {
		System.out.println("---- mymethod2 시작 ----");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
//			System.out.println(arr[i]);
			sum += arr[i];
		}
		
		System.out.println("---- mymethod2 종료 ----");
		return sum;
		
	}
	
	//	 return 타입--(parameter) 함수명에 parameter 타입 	
	public static int mymethod(int i) {
		
		return i * 2;
		// method (함수)는 나중에 실행시키는 코드
	}
}
