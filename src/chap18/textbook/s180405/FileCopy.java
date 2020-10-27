package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		// Reader, Writer 사용해서 파일 복사
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des, true);
		
		int ch = reader.read();
		System.out.println(ch);
		System.out.println((char) ch);
		
		int data;
		char[] cbuf = new char[100];
		while ((data=reader.read(cbuf)) != -1) {
			String data1 = new String(cbuf, 0, data);
			System.out.println(data1);
			writer.write(data);
		}
		char[] arr = new char[3];
		arr[0] = '강';
		arr[1] = '한';
		arr[2] = '결';
			
		writer.write(arr);
		writer.write(arr, 1, 2);
		writer.write("문자열 출력");
		
		writer.flush();
		writer.close();
		reader.close();
	}
}
