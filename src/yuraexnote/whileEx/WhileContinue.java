package yuraexnote.whileEx;

public class WhileContinue {
	public static void main(String[] args) {
		// continue문은 반복문인 for, while, do-while문에서만 사용된다.
		// 블록 내부에서 continue문이 실행되면 for문의 증감식 또는 while문, do-while문의 조건식으로 이동한다.
		// break문과 마찬가지로 continue문도 대개 if문과 같이 사용되는데, 특정 조건을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i); // if문의 조건인 2로 나눈 나머지가 0이 아닐경우, 즉 홀수인 경우 System.out.println(i)는 실행되지 않고, continue 문이 실행되어 증감식으로 이동하게 된다.
		}
	}
}
