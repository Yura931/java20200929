package chap15.textbook.exercises.p1605;

import java.util.*;


public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		 List<String> javaList = new ArrayList<>(list);
			
		for (int i = 0; i < list.size(); i++) {
			String item = list.get(i);
			if (item.toLowerCase().contains("java")) {
				javaList.add(item);
			}
		
		}
		
				
		for (String java : javaList) {
			
			System.out.println(java);
		}
	}
}
