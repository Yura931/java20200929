package chap06.lecture.encapsulation;

public class Car {
	private	int speed; // 보통 필드는 private로 접근 제한 , 데이터는 공개하지 않고 메소드만 공개
	private String name;
	private String model;
	private int price;
	
	public void setSpeed(int speed) {
		if(speed >=0) {
			
			this.speed = speed; //method 노출
		}
	}
	
	public int getSpeed() {
		return this.speed;  // 자기 speed필드를 얻어오는 getSpeed메소드를 public
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} // source 메뉴 Generate getters and setters
}
