package com.techlabs.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		IInternet internetuser1=new UserProxy();
		internetuser1.allowAccess("Prashant");
		IInternet internetuser2=new UserProxy();
		internetuser2.allowAccess("Abhay");

	}

}
