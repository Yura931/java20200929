package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorEx1 {
	public static void main(String[] args) {
		Random random = new Random();		
		// 음수, 0, 양수 중 하나 리턴
		// 왼쪽이 작으면 음수
		// 왼쪽이 크면 양수
		// 같으면 0
		Comparator<Integer> asc = (x, y) -> x - y; // 컬렉션을 정렬할 때 사용
//		Comparator<Integer> asc = (x, y) -> y - x;
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}
		
		list.sort(asc);
		list.forEach(e -> System.out.println(e));
	}
}
