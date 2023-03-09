package com.techlabs.proxy;

import java.util.Arrays;
import java.util.List;

public class UserProxy implements IInternet{
	static List<String> validusernames;
	IInternet validuser;
    public UserProxy()
    {
	     validusernames=Arrays.asList("Swapnil","Prashant","Nilesh","Manoj");
    }
	@Override
	public void allowAccess(String username)  {
		if(validusernames.contains(username))
		{
			validuser=new User();
			validuser.allowAccess(username);
		}
		else
		{
			System.out.println(username+":Access Denied");
		}
			
		
	}

}
