package chap05;

public class ArrayEx05Length {
	public static void main(String[] args) {
		int[] arr1 = {99, 88, 77, 66}; //method와 property를 가지고 있음. 각 instance마다 속성과 기능을 가지고 있다.
		int[] arr2 = {5, 4, 3, 2, 1};
			
		
		System.out.println(arr1.length); // length를 이용
		System.out.println(arr2.length);
		
		for (int i = 0; i <arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
