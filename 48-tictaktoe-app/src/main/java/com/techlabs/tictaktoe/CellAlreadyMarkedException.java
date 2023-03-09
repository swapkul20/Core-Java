package com.techlabs.tictaktoe;

public class CellAlreadyMarkedException extends Exception {
	String message;

	public CellAlreadyMarkedException(Cell cell) {
		message="Cell is already marked as:"+cell.getMark();
	}
	public String getMessage()
	{
		return message;
	}

}
