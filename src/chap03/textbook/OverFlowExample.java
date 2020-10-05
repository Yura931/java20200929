package chap03.textbook;

public class OverFlowExample {
	public static void main(String[] args) {
//		int x = 1000000;
		long x = 1000000;
//		int y = 1000000; // int 저장 값 4byte를 넘어 섬, 값을 저장하는데 한계가 있음.
		long y = 1000000;
//		int z = x * y; 
		long z = x * y;
		System.out.println(z);
		
	}
}
