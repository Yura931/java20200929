package yuraexnote.methodEx;

public class Computer {
	int sum1(int[] values) { // 메소드를 호출 할 때 배열을 넘겨줌으로써 배열의 항목 값들을 모두 전달할 수 있따. 배열의 항목 수는 호출할 때 결정된다.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { // 매개 변수를 배열타입으로 선언하면, 메소드를 호출하기 전에 배열을 생성해야 하는 불편한 점이있다. 그래서 배열을 생성하지 않고 값의 리스트만 넘겨주는 방법도 있다. 매개변수"..."을 사용해서 선언하게 되면 , 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
