package chap15.textbook.exercises.p08;

import java.util.HashSet;
import java.util.Set;

import chap13.lecture.textbook.s130601.Student;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student (1, "홍길동"));
		set.add(new Student (2, "홍길동"));
		set.add(new Student (1, "홍길동"));
	
	Iterator<Student> iterator = set.iterator();
	While(iterator.hasNext()) {
		Student student = iterator.next();
		System.out.println(student.studentNum + ":" + student.name);
	}
	
	}
}
