package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"}; // String의 참조값을 복사
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length ); //arraycopy라는 method 
		// (Object src, int srcPos, Object dest, int destPos, int length) 5개의 parameter를 받음
		//	원본배열    시작인덱스  카피배열	카피본시작인덱스 갯수
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}
}
