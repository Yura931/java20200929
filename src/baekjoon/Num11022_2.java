package baekjoon;

import java.util.Scanner;

public class Num11022_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int Arr[] = new int[T];
		int Brr[] = new int[T];
		
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sc.nextInt();
			Brr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < Arr.length; i++) {
			System.out.println("Case #" + (i+1) + ": " + Arr[i] + " + " + Brr[i] + " = " + (Arr[i]+Brr[i]));
		}
	}
}
