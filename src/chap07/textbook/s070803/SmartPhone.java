package chap07.textbook.s070803;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner); //Phone의 생성자 호출
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
