package chap05.lecture;

public class ArrayCopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = {{3,4}, {88,99}, {2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length]; // 새로운 배열이 만들어지면서 새instance가 생김 , arr1, arr2 열의 참조값이 같지 않음.
			
			for (int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j];
			}
			arr2[i] = arr1[i];
		}
		
		arr1[0][0] = 100; // 같은 instance 값을 가지고 있는 것이 아니기 때문에 arr1의 값을 바꾸면 arr2가 똑같이 불러오지 못함.
		
		for (int[] arr : arr2) {
			for (int n : arr) {
				System.out.println(n);
			}
		}
	}
}
