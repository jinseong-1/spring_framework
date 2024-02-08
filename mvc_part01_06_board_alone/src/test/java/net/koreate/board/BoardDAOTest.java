package net.koreate.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bitc.board.dao.BoardDAO;
import com.bitc.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"classpath:spring/root-context.xml"}
)
public class BoardDAOTest {

	@Autowired
	@Qualifier("bo")
	BoardDAO bo;
	
	@Test
	public void testBoard() {
		BoardVO board = new BoardVO();
		board.setTitle("bye");
		board.setContent("h2");
		board.setWriter("kk");
		
		try {
			int result = bo.create(board);
			System.out.println("create board resutl : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
