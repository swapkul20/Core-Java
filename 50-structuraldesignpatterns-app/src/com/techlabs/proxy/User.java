package com.techlabs.proxy;

public class User implements IInternet {

	@Override
	public void allowAccess(String username) {
		System.out.println(username+": Access Granted");
		
	}

}
