package chap08.textbook.s080201;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10; // public static final 생략 가능
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn(); // public abstract 생략 가능
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) { // public 생략 가능, 인터페이스의 default메소드 , 접근제한자와는 완전 다르다.
		if(mute) {
			System.out.println("무음 처리합니다.");
			
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
