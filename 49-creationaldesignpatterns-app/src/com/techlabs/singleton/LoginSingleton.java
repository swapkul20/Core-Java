package com.techlabs.singleton;

public class LoginSingleton {
	
	private static LoginSingleton login;
	private LoginSingleton()
	{
		
	}
	public static LoginSingleton getLoginSingleton()
	{
		if(login==null)
			login= new LoginSingleton();
		return login;
	}
    
	public void display()
	{
		System.out.println("Singleton Design Pattern ");
	}
}
