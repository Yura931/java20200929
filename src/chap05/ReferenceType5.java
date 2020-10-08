package chap05;

public class ReferenceType5 {
	public static void main(String[] args) {
		String str1 = "java"; //같은참조값 하나의 instance만 만들어짐
		String str2 = new String("java");
		
		str2 = null;  // 원래 가지고 있던 참조값을 덮어 씀; 참조하고있는 instance값이 없다는 의미;
					  // 위 new String("java")는 참조되지 않는 instance가 되고 불필요한 메모리가 남아있게 됨   
		// java virtual machine 은
		// 불필요한 인스턴스를 모아 제거함
		// -->> garbage collector (gc)
	
	}
	
}
