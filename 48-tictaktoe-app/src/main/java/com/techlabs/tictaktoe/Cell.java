package com.techlabs.tictaktoe;

public class Cell {
	private MarkType mark;

	public Cell() {
		mark=MarkType.Empty;
	}
	public Cell(MarkType mark)
	{
		this.mark=mark;
	}
	public MarkType getMark() {
		return mark;
	}
	public void setMark(MarkType mark) throws CellAlreadyMarkedException {
		if(this.mark==MarkType.O || this.mark==MarkType.X )
			throw new CellAlreadyMarkedException(this);
		if(this.mark==MarkType.Empty)
		{
			if(mark!=MarkType.Empty)
			{
			     this.mark=mark;
			     System.out.println("Cell Marked as:"+mark);
			}
		}
		
	}
	public boolean isEmpty()
	{
		if(mark==MarkType.Empty)
			return true;
		return false;
	}
    
}
