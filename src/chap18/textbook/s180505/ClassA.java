package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
	static final long serialVersionUID = 1L; // 시리얼하기위한 버전정보 구나
	
	int field1;	
	ClassB field2 = new ClassB();
	static int field3; // static 필드는 직렬화 되지 않음
	transient int field4; // 마찬가지 직렬화 되지 않음
}
