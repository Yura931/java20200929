package chap05;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = {{3,4}, {88,99}, {2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr1[0][0] = 100; // 값 복사가 아닌 참조값을 복사하는 것 arr1[0][0]과 arr2[0][0]은 같은 값을 가르키고 있다.
		
		for (int[] arr : arr2) {
			for (int n : arr) {
				System.out.println(n);
			}
		}
		
	}
}
