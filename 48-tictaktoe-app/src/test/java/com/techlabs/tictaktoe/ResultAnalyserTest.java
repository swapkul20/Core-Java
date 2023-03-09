package com.techlabs.tictaktoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultAnalyserTest {

	@Test
	void testAnalyaseResult() throws CellAlreadyMarkedException {
		Board board=new Board();
		board.setCellMark(1, MarkType.O);
		board.setCellMark(2, MarkType.X);
		board.setCellMark(3, MarkType.O);
		board.setCellMark(4, MarkType.X);
		board.setCellMark(5, MarkType.O);
		board.setCellMark(6, MarkType.X);
		board.setCellMark(7, MarkType.O);
		board.setCellMark(8, MarkType.X);
		board.setCellMark(9, MarkType.O);
		ResultAnalyser analyser=new ResultAnalyser(board);
		assertEquals(ResultType.WIN,analyser.analyaseResult());
		
	}

}
