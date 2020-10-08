package chap04.exercises;

public class Exercise05 {
	public static void main(String[] args) {
		//4x + 5y = 60 의 해
		// x * y = 40
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
			
				int result = (4*x) + (5*y);
			
			if(result == 60) {
				System.out.println("(" + x + "," + y +")");
			}
			}
		
		}
	}
}
