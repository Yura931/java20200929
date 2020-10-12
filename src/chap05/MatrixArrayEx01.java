package chap05;

public class MatrixArrayEx01 { // Matrix = (행, 열)을 배열로
	public static void main(String[] args) { 
		int[][] matrix = new int[3][2]; //[행의 갯수][열의 갯수] integer배열을 저장하는 배열 // 참조의 참조 .. [][] 의 원소는 참조타입..
		
		int[] arr = new int[3]; //[]integer배열을 저장 []의 원소는 int,등 기본타입 []와 [][]의 차이 오빠한테 물어보기 ..
 		System.out.println(arr.length); // 속성과 기능, length라는 속성 사용
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
//		System.out.println(matrix[3].length); //4번째 length는 없음
		
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		
		//matrix
		matrix[0][0] = 9; //첫번째 행, 첫번째 열 [행 번호][열 번호]
		matrix[2][0] = 1; //세번째 행, 첫번째 열
		
//		matrix[2][2] = 2;
	
	}
}
