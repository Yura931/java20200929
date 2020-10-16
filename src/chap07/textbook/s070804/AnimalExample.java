package chap07.textbook.s070804;

public class AnimalExample {
	public static void main(String[] args) {
		
		// 일반적인 방식으로 Dog와 Cat 변수로 호출
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// 변수의 자동 타입 변환  
		// Animal 변수로 타입 변환해서 sound() 메소드를 호출 , 자식타입은 부모 타입으로 자동 타입 변환이 될 수 있고, 
		// 메소드가 재정의되어 있을 경우 재정의된 자식 메소드가 호출되는 상속의 특징이 그대로 적용된다.
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		// 메소드의 다형성
		// 부모 타입의 매개 변수에 자식 객체를 대입해서 메소드의 다형성을 적용, 자식 객체가 부모 타입으로 자동 타입 변환되어 재정의된 sound() 메소드가 호출
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) { // parameter에 어떤 args가 들어와도 animal에 sound메소드가 안전하게 실행된다.
		animal.sound();
	}
}
