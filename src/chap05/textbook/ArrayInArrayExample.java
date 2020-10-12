package chap05.textbook;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3]; //2행 3열
		for(int i = 0; i<mathScores.length; i++) {
			for(int k = 0; k<mathScores[i].length; k++) { //행의 for문
				System.out.println("mathScores["+i+"]["+k+"])="// 열의 for문
						+mathScores[i][k]);
			}
		}
				System.out.println();
				
				int[][] englishScores = new int[2][];
				englishScores[0] = new int[2];
				englishScores[1] = new int[3];
				for(int i = 0; i < englishScores.length; i++) {
					for(int k = 0; k < englishScores[i].length; k++) { // i = 0 일때 2 , i = 1 일때 3,
						System.out.println("englishScores["+ i +"]["+ k +"])="
								+englishScores[i][k]);
					}
				}
				System.out.println();
				
				int[][] javaScores = { {95, 80}, {92, 96, 80} }; 
				for(int i = 0; i < javaScores.length; i++) {
					for(int k = 0; k < javaScores[i].length; k++) {
						System.out.println("javaScores["+ i +"]["+ k +"]="
								+javaScores[i][k]);
						
					}
				}
	}
}
