package chap05;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		// 여러 같은타입의 값을 한번에 묶어서 저장하고 싶을 떄;
		
		
		// integer 배열 타입 = 참조타입; instance가 따로 만들어 짐;
		int [] arr1;
		arr1 = new int[3]; // new + 타입 [저장할 갯수] 의 참조값을 = arr1에 저장
		
		System.out.println(arr1[0]); //[] 안에 index번호 적어줌
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
		
		// 배열의 index를 넘어가면 프로그램 종료 됨.
		
		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		int[] arr2;
		arr2 = arr1;
		arr2[0] = 55;
		
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);
		//같은 instance를 가지고 있다는 사실
		
				
				 
	}
}
