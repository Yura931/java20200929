package chap05.lecture;

public class ReferenceType3 {
	public static void main(String[] args) {
		int i = 30;
		int j = 30;
		
		String str1 = "java";
		String str2 = "java";
		
		// 각각 값을 넣어줬을 때;
		System.out.println(i == j);
		System.out.println(str1 == str2);
		// 같은 instance 사용 시 저장된 참조 값을 가져와 사용 함;
	}
}
