package chap05.lecture;

public class MatrixArrayEx02 {
	public static void main(String[] args) {
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][]; // 열의갯수 지정해주지 않음 지정된 instance 값이 없기 때문에 null
		mat2[0] = new int[2]; // instace가 만들어지고 참조값을 가지게 됨.
		mat2[1] = new int[3]; // 열의 갯수를 지정해주지 않고, 나중에 만들어줄 때에는 열의 길이가 같을 필요 없음.
		
		int[] arr1 = null;
		arr1 = new int[4]; // 나중에 값을 할당
	}
}
