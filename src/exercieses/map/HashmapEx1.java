package exercieses.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx1 {
	
	public static void main(String[] args) {
/* HashMap 이란?
 * HshMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션
 * Map 인터페이스를 상속하고 있기때문에 MAp의 성질을 그대로 가지고 있다.
 * Map은 키와 값으로 구성된 Entry 객체를 저장하는 구조를 가지고 있는 자료구조이다.
 * key와 value는 모두 객체이다.
 * value는 중복 저장될 수 있지만 key는 중복 저장될 수 없다.
 * 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치된다.
 * HashMap은 이름 그대로 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다.	
 */	
		
//		HashMap 선언
		Map<String,String> map1 = new HashMap<String,String>(); //HashMap생성
		Map<String,String> map2 = new HashMap<>(); //new에서 타입 파라미터 생략가능
		Map<String,String> map3 = new HashMap<>(map1); //map1의 모든 값을 가진 HashMap생성
		Map<String,String> map4 = new HashMap<>(10); //초기 용량(capacity)지정
		Map<String,String> map5 = new HashMap<>(10, 0.7f); //초기 capacity,load factor지정
		Map<String,String> map6 = new HashMap<String,String>(){{put("a","b");}};	//초기값 지정
		
	}
}
