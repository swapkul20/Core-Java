package com.techlabs.unitestingapp;

public class StringUtil {
	public String truncateAInFirstTwoPosition(String str)
	{
		String returnString=str;
		if(str.charAt(0)=='A')
		{
			returnString=str.replaceFirst("A","");
			if(str.charAt(1)=='A')
				returnString=returnString.replace("A","");
				
		}
		return returnString;
	}
	
	public boolean AreFirstAndLastTwoCharactersSame(String str)
	{
		String first=str.substring(0,1);
		String last=str.substring(str.length()-2,str.length()-1);
		if(first.equals(last))
			return true;
		return false;
	}

}
