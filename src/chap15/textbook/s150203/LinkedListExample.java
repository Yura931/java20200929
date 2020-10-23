package chap15.textbook.s150203;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();  // ArrayList , List 인터페이스를 구현한 여러 클래스들이 존재한다.
		List<String> list2 = new LinkedList<String>(); // LinkedList 둘다 List타입 사용방법 비슷 
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++ ) {
			list1.add(0, String.valueOf(i)); // 0번인덱스에 10000번 추가 , 나머지요소 오른쪽으로 밀리는 현상
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i)); // 나머지 연산이 밀려나지 않음
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns"); // Linked연산이 시간이 더 빨랐다는 걸 보여줌
	}
}
