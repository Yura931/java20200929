package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/BufferedReaderEx1.java"; // 윈도우 디렉토리 나누는 문자 = \
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		System.out.println(line);
		
		br.close();
		fr.close();
	}
}
