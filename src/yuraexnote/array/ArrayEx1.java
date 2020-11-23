package yuraexnote.array;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 데이터타입[] 변수 = { 값0, 값1, 값2, 값3, ...};
		int sum = 0;
		int[] score = { 1, 3, 5, 7, 9, 11};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = sum / 30;
		System.out.println(avg);
	}
}
