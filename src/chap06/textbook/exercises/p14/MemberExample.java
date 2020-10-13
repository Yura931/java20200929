package chap06.textbook.exercises.p14;

public class MemberExample {
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("김자바", "java");
		
		System.out.printf(user1.name);
		System.out.println(user1.id);
		
		System.out.printf(user2.name);
		System.out.println(user2.id);
		
	}
}
