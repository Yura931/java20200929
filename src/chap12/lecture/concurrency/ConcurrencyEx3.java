package chap12.lecture.concurrency;

public class ConcurrencyEx3 {
	static int field = 0;
	static final Object lock = new Object();
		
	public static void inc() { // 먼저 점유한 쓰레드가 실행종료할 때 까지 기다렸다 실행, 대신 속도 느림
		synchronized (lock) {
		field++;
		}
	}
		
	public static void main(String[] args) {
		Thread t1 = new Thread() { // 쓰레드가 관리하는 값 안전하게 관리된다는 보장 없음 , 값을 공유하지 않는 것이 최선
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
			
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field); // 메모리에 있는 값을 더한 후 저장
			};
		};
		t1.start();
		t2.start();
		}
	}

