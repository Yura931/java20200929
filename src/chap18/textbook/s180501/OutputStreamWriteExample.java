package chap18.textbook.s180501;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriteExample {
	public static void main(String[] args) throws Exception {

	FileOutputStream fos = new FileOutputStream("file.txt");
	Writer writer = new OutputStreamWriter(fos);
	
	String data = "바이트 출력 스트링을 무자 출력 스트링으로 변환";
	writer.write(data);
		
	writer.flush();
	writer.close();
	System.out.println("파일 저장이 끝났습니다.");
	}
}
