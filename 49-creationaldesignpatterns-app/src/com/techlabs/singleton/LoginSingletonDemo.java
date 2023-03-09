package com.techlabs.singleton;

public class LoginSingletonDemo {
	public static void main(String args[])
	{
		LoginSingleton login=LoginSingleton.getLoginSingleton();
		login.display();
		LoginSingleton login2=LoginSingleton.getLoginSingleton();
		login2.display();
		
	}

}
