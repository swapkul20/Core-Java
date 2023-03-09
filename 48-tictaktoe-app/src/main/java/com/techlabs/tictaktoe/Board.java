package com.techlabs.tictaktoe;

public class Board {
	private Cell cells[][]=new Cell[3][3];
	public Board() throws CellAlreadyMarkedException
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			    cells[i][j]=new Cell();
		}
	}
	
   public boolean isBoardFull()
   {
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		         if(cells[i][j].getMark()==MarkType.Empty)
			              return false;
	   }
	   return true;
   }
   public void setCellMark(int loc,MarkType mark) throws CellAlreadyMarkedException
   {
	   if(!isBoardFull())
	   {		       
		   int i=0,j=loc%3;
		   if(loc<=3)		   
			   i=0;
			if(loc>3 && loc<=6)
				i=1;
			if(loc>6 && loc<=9)
				i=2;
			cells[i][j].setMark(mark);
		
       }
   }

public Cell[][] getCells() {
	return cells;
}


   
}
