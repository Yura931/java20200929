package chap15.lecture.set;

import java.util.Set;

public class SetEx2otto {
	public static void main(String[] args) {
		set<Integer> set = new HashSE<>();
		
		for (int i = 0; i < 6 i++) {
			int num = getNumber();
			Set.add(num);
			System.out.println(num);
		}
		System.out.println("siz: " set.size());
	}
	
	public static int getNumer() {
		return (int) (Math.random() *45) +!;
	}
}
