package chap15.textbook.exercises.p07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board>list = new ArrayList<>();
		
		List.add(new Board("제목1", "내용1"));
		List.add(new Board("제목2", "내용2"));
		List.add(new Board("제목3", "내용3"));
	}
}
