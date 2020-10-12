package chap05.exercises;

public class Exercise007 {
	public static void main(String[] args) {

		
		int[] array = { 1, 5, 3, 8, 2};
		int min = array[0];
		
		int i = 0;
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if (min > array[i]) {
				min = array[i];
				
			}
		}
		
		System.out.println("min :" + min);
	}
}
