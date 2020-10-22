package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	@MyAnnotation
	private int i;
	
	// 주석들.......
	
	// annotation 실행 시 영향을 미칠 수 있는 정보
	
	@Override // Override도 어노테이션
	@MyAnnotation
	public String toString() {
	
		return super.toString();
	}
	
	@MyAnnotation(value = "abc" , number = 5, names = {"c", "d"}) // value = "abc" == "abc" 여러값을 넣을 때에는 값의 이름을 함께 사용
	public static void mymethod() {
		
	}
}
