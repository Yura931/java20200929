package chap05.textbook;

public class ArrayCreateByBalueListExample2 {
	public static void main(String[] args) {
		int[] scores; // 변수 선언
		scores = new int[] {83, 90, 87}; // integer배열 instance배열 참조값 저장
		int sum1 = 0; //
		for(int i = 0; i<3; i++ ) {
			sum1 += scores[i]; // scores값을 sum1에 더해줌
		}
		System.out.println("총합 : " + sum1); //세개 값을 더한 값 저장
				
//		리턴된 총합을 sum2에 저장
				
		int sum2 = add ( new int[] {83, 90, 87} ); // 오른쪽 값 = add method를 호출한 값 (변수에 담아써도 되고 그냥 써도 됨)
		System.out.println("총합 : " + sum2);
		System.out.println();
		
		int sum3 = add(new int[] {1, 2, 3});
		System.out.println(sum3);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
