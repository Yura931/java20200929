package yuraexnote.forEx;

public class Exercise03 {
	public static void main(String[] args) {
		
		// for문을 이용해 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i+=3) {
			sum += i;
		}
		System.out.println(sum);
	}
}
