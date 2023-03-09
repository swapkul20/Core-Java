package com.techlabs.tictaktoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
    Board board;
    
    @BeforeEach
	void init() throws CellAlreadyMarkedException {
		//board=new Board();
	}
	@Test
	void testIsBoardFull() throws CellAlreadyMarkedException {
		
		board=new Board();
		for(int i=1;i<=9;i++)
			board.setCellMark(i, MarkType.O);
	    assertTrue(board.isBoardFull());
	 
	 }
	@Test
    void testIsBoardNotFull() throws CellAlreadyMarkedException {
		
		Board board=new Board();
		for(int i=1;i<7;i++)
			board.setCellMark(i, MarkType.O);
	    assertFalse(board.isBoardFull());
	    
	}
	
}
