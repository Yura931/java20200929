package yuraexnote.whileEx;

public class WhileBreakEx1 {
	public static void main(String[] args) {
		while(true) {
			
			int num = (int)(Math.random()*10) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
