package yuraexnote.whileEx;

import java.util.Scanner;

public class WhileEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 0;
		int sum = 0;
		
		while(i <= N) {
			System.out.println(i);
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
