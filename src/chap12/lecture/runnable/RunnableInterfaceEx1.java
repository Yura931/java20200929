package chap12.lecture.runnable;

public class RunnableInterfaceEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable1()); // 생성자 파라미터에 ,상속 보다는 인터페이스 구현이 더 유연
		Thread t2 = new Thread(new Runnable2()); 
		
		t1.start();
		t2.start();
	}
}
