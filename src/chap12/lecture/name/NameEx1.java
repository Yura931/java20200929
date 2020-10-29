package chap12.lecture.name;

public class NameEx1 {
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread(); // 현재 실행되고 있는 쓰레드의 객체를 리턴
		System.out.println(th0.getName());
		th0.setName("my main thread");
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName());
			}
		};
		
		Thread t2 = new Thread() {
			public void run() { // run메소드는 jvm이 실행시키는 것, 어떤게 먼저 실행될 지 랜덤
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName());
			}
		};
		t1.start();
		t2.start();
	}
}
