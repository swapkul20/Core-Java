package com.techlabs.newcommand;

public class Television {
	private static Television television;
	private boolean onStatus;

	private Television() {
		onStatus = false;
	}

	public static Television getTelevisionInstance() {

		if (television == null) {
			return new Television();
		}
		return television;
	}

	public boolean on() {
		if (onStatus == false) {
			onStatus=true;
			return true;
		}
		onStatus=false;
		return false;
	}

	public boolean off() {
		if (onStatus == true) {
			onStatus=false;
			return true;
		}
		onStatus=true;
		return false;
	}

}
