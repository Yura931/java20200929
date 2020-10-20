package chap10.textbook.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		if(args.length >= 2) {
		
		// 배열의 인덱스 범위를 넘어 사용
		
		String data1 = args[0]; // 존재하지 않는 인덱스 사용으로 인한 오류
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		
		}
		System.out.println("프로그램 종료");
	}
}
