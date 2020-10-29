package chap12.lecture.annoymous;

public class AnnoymousEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() { // 상속과 인스턴스 생성을 한번에 하고 싶다
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(new Runnable() { //익명클래스 구현 클래스 몸통을 가지고 있는 인터페이스의 인스턴스 바로 생성
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println((char) ('a' + i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		});
		
		Thread t3 = new Thread(() ->  { // 람다식, 인터페이스 중 추상메소드 하나만 가지고 있으면 구현해야하는 메소드가 하나라는것이 명확 = 메소드명,파라미터명 생략이 가능
			for (int i = 0; i < 5; i++) {
				System.out.println((char) ('Z' - i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();		
		t2.start();
		t3.start();
	}
}
