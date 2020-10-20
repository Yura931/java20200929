package baekjoon;

import java.util.Scanner;

public class Num10950_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int arr[] = new int[T];
		
		for (int i = 0; i < T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			arr[i] = A + B;			
		}		
		scan.close();
		
		for (int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
		
//		for (int K : arr) {
//			System.out.println(k);
	}
		
}	


