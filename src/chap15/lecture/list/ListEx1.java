package chap15.lecture.list;
	

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	
	public static void main(String[] args) {
		
		//순서가 있고 중복 허용
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");
		
		System.out.println(list.size());
		
		
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		list.set(3, "jsp");
		System.out.println(list.get(3));
		
		
		list.remove(2);
		System.out.println(list.set(2));
		
		System.out.println("모든 요소 탐색");
		for (int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
		System.out.println("모든 요소 탐색 향상된 for");
				for(String s : list) {
					System.out.println(s);
				}

				List<Integer> ListInt = new ArrayList<>();
				list.add("servlet");
				list.add(3);
				
				List listNotype = new ArrayList();
				listNoype.add("string");
				listNotypeadd(3);
				
				Object o1 = listtype.
						
				
	}
}
