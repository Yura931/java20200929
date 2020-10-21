package chap05.lecture;

public class ReferenceType4 {
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String ("java");
		
		// str1과 str2는 같은 참조값을 가짐.
		// str3은 새로운 instance가 만들어짐 - str1, str2와 다른 참조값을 가짐

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// instance가 가진 문자열은 같지만 참조값은 다름
		
		System.out.println(str1.equals(str3)); // equals = 가지고 있는 instance를 비교하는 method
	}
}
