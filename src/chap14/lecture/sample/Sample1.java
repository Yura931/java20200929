package chap14.lecture.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
	public static void main(String[] args) {	
		List<String> names = new ArrayList<>();
	
		names.add("java");
		names.add("html");
		names.add("css");
		names.add("jsp");
		names.add("servlet");
		
//		Consumer<String> o1 = (s) -> System.out.println(s);;
		
		names.forEach(s -> System.out.println(s)); // list에 있는 각 아이템을 꺼내서 생략된 17라인 accept 메소드의 파라미터에 순서대로 한번씩 넣어 5번 실행시킨다. 
												   //17라인을 19라인처럼 간결하게 생략해서 사용 가능하다.
	}
}
