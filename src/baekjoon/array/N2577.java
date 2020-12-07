package baekjoon.array;

import java.util.Scanner;

public class N2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value); // value에 저장한 값을 String으로 변환
		System.out.println(value);
		sc.close();
		
		for(int i = 0; i < 10; i++) { // 1부터 9까지의 각 숫자의 개수를 구해야하므로 9번 반복하는 for문 생성
			int cnt = 0; 
			for (int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) { 
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
