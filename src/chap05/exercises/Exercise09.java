package chap05.exercises;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true; 
		int studentNum = 0;
		int[] scores = null; // 참조하는 instance가 없는 상태;
		
		Scanner scanner = new Scanner(System.in);

		while (run) { // while문은 true일 때 실행;
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt(); // 콘솔에 입력된 숫자를 읽고 리턴;

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // scores studentNum배열 instance값 저장; 
				
			} else if (selectNo == 2) {
				
				for (int i = 0; i < studentNum; i++) { // 배열 index는 0부터 저장 i 는 배열보다 1 작게;
					System.out.println("scores[" + i + "]>"); 
					scores[i] = scanner.nextInt(); 
				}
				
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) { // scores 인덱스 배열 갯수 반복;
					
					System.out.println("scores[" + i + "]:" + scores[i]); // 2에서 넣어준 scores[인덱스]값; 
				}

			} else if (selectNo == 4) {
				int sum = 0; 
				int max = Integer.MIN_VALUE; // 최댓값
				double avg = 0.0; //평균 값
				
				for (int i = 0; i < scores.length; i++) { //
					if (max <= scores[i]) {
						max = scores[i]; //배열 요소
					}
					
					sum += scores[i];
				}
				
				avg = (double) sum / scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);

			} else if (selectNo == 5) {
				run = false;
			}

			}
			System.out.println("프로그램 종료");
		
	}
}
