package chap05.exercises;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(max < array[i]) {
				max = array[i]; 
//			max = (max > array[i]) ? max : array[i];
			
		/*	max = max > array[0] ? max : array[0];
			max = max > array[1] ? max : array[1];
			max = max > array[2] ? max : array[2];
			max = max > array[3] ? max : array[3];
			max = max > array[4] ? max : array[4]; */
			
			
			
		}
					
		}
		System.out.println("max : " + max);
	}
}