package chap05.lecture;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = new int [] {99, 88, 77};
		int[] arr2 = {99, 88, 77}; //배열 더 간단하게 instance
		
		for (int i = 0; i < 3; i++ ) {
			System.out.println(arr1[1]);
		}
		
		System.out.println("---------------");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3;
		int[] arr4;
		
		arr3 = new int[] {11, 22, 33};
//		arr4 = {11, 22, 33};
	}
}