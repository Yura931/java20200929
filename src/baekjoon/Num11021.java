package baekjoon;

import java.util.Scanner;

public class Num11021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int arr[] = new int[T];
		int brr[] = new int[T];
		
		for(int i = 0; i < brr.length; i++) {
			arr[i] = scan.nextInt();
			brr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < brr.length; i++) {
			System.out.println("Case #" + (i+1) + ": " + (arr[i]+brr[i]));
		}
	}
}
	
	
