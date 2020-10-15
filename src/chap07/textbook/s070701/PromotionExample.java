package chap07.textbook.s070701;

class A {}

class B extends A {} // B = A
class C extends A {} // C = A

class D extends B {} // D = B
class E extends C {} // E = C

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // 자동 형변환이 되는것 , 아래타입에서 윗타입으로
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e;
		//C c2 = d;
	}
}
