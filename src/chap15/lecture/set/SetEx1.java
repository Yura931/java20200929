package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		// 순서가 없고, 중복되지 않음
		Set<String> set = new HashSet<>();
	
		// 추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("jsp");
		set.add("dbms");
		set.add(new String("java")); 
		
		System.out.println(set.size());
	
		//삭제
		set.remove("jquery");
		System.out.println(set.size());
		set.remove(new String("html")); // 서로다른 객체이지만 hashCode와 equals메소드가 같다고 나옴
		System.out.println(set.size());
		
		//검색(모두 탐색)
		System.out.println("향상된 for");
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("====Iterator");
		Iterator<String> iter = set.iterator();
		iter.hasNext(); // 
		iter.next(); // 다음 element를 리턴해주는 메소드
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
	}
}
