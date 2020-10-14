package chap06.textbook.s061401;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	
	//메소드
	public int getSpeed() {  // 메소드를 활용해서 필드를 마련
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
