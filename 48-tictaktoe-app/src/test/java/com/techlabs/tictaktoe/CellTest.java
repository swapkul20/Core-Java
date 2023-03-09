package com.techlabs.tictaktoe;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CellTest {
    Cell cell;
	
	@BeforeEach
	void init() {
		cell=new Cell();
	}
	
	@Test	
	void testSetMarkO() throws CellAlreadyMarkedException {
		cell=new Cell();
		cell.setMark(MarkType.O);
		assertEquals(MarkType.O,cell.getMark(),"Marked O");
		
	}
	@Test
	void testSetMarkX() throws CellAlreadyMarkedException {
		cell=new Cell();
		cell.setMark(MarkType.X);
		assertEquals(MarkType.X,cell.getMark(),"Marked X");
			
	}
	@Test
	void testSetMarkEmpty() throws CellAlreadyMarkedException {
		cell=new Cell();
		cell.setMark(MarkType.Empty);
		assertEquals(MarkType.Empty,cell.getMark(),"Marked EMPTY");
		
	}
	@Test
	void testSetMarkXEmpty() throws CellAlreadyMarkedException {
		cell=new Cell();
		cell.setMark(MarkType.O);
		assertThrows(CellAlreadyMarkedException.class,()->cell.setMark(MarkType.X));
	
	}
	
	@Test
	@DisplayName("Newly Created Cell Check")
	void testIsEmpty() {
		cell=new Cell();
		assertEquals(MarkType.Empty,cell.getMark(),"New Cell must be empty");
	}

}
