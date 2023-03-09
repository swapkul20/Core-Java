package com.techlabs.tictaktoe;

public class ResultAnalyser {
	private Board board;
	private ResultType result;
	public ResultAnalyser(Board board) {
		super();
		this.board = board;
		result=ResultType.PROGRESS;
		
	}
	private void horizontalWinCheck()
	{
		
		Cell cells[][]=board.getCells();
		
		for(int i=0;i<3;i++)
		{
			MarkType markcol1=cells[i][0].getMark();
			MarkType markcol2=cells[i][1].getMark();
			MarkType markcol3=cells[i][2].getMark();
		
		
		if(markcol1==MarkType.O && markcol2==MarkType.O && markcol3==MarkType.O)
			result=ResultType.WIN;
		
		if(markcol1==MarkType.X && markcol2==MarkType.X && markcol3==MarkType.X)
			result=ResultType.WIN;
		}
		
	}
	
	private void verticalWinCheck()
	{
		
		Cell cells[][]=board.getCells();
		
		for(int i=0;i<3;i++)
		{
			MarkType markcol1=cells[0][0].getMark();
			MarkType markcol2=cells[1][i].getMark();
			MarkType markcol3=cells[2][i].getMark();
		
		
		if(markcol1==MarkType.O && markcol2==MarkType.O && markcol3==MarkType.O)
			result=ResultType.WIN;
		
		if(markcol1==MarkType.X && markcol2==MarkType.X && markcol3==MarkType.X)
			result=ResultType.WIN;
		}
		
	}
	private void digonalLRWinCheck()
	{
		
		Cell cells[][]=board.getCells();
		
		
			MarkType markcol1=cells[0][0].getMark();
			MarkType markcol2=cells[1][1].getMark();
			MarkType markcol3=cells[2][2].getMark();
		
		
		if(markcol1==MarkType.O && markcol2==MarkType.O && markcol3==MarkType.O)
			result=ResultType.WIN;
		
		if(markcol1==MarkType.X && markcol2==MarkType.X && markcol3==MarkType.X)
			result=ResultType.WIN;
		
		
	}
	
	private void digonalRLWinCheck()
	{
		
		Cell cells[][]=board.getCells();
		
		
			MarkType markcol1=cells[0][2].getMark();
			MarkType markcol2=cells[1][1].getMark();
			MarkType markcol3=cells[2][0].getMark();
		
		
		if(markcol1==MarkType.O && markcol2==MarkType.O && markcol3==MarkType.O)
			result=ResultType.WIN;
		
		if(markcol1==MarkType.X && markcol2==MarkType.X && markcol3==MarkType.X)
			result=ResultType.WIN;
		
		
	}
	
	public ResultType analyaseResult()
	{
		horizontalWinCheck();
		return result;
	}
	
	

}
