package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteControl;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void TurnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnOff() 추상 메소드의 실체 메소드
	public void TurnOff() {
		System.out.println("Audio를 끕니다.");
	}
	//setVoulume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	
}