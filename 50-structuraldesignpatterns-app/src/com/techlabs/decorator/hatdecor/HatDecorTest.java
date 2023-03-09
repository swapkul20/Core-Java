package com.techlabs.decorator.hatdecor;

public class HatDecorTest {

	public static void main(String[] args) {
		IHat goldenPhat=new GoldenHat(new ProminentHat());
		IHat goldenShat=new GoldenHat(new StandardHat());
		IHat ribbonedPhat=new RibbonedHat(new ProminentHat());
		IHat ribbonedShat=new RibbonedHat(new StandardHat());
		
		System.out.println(goldenPhat.getName()+goldenPhat.getDescirption()+goldenPhat.getPrice());
		System.out.println(goldenShat.getName()+goldenShat.getDescirption()+goldenShat.getPrice());
		System.out.println(ribbonedPhat.getName()+ribbonedPhat.getDescirption()+ribbonedPhat.getPrice());
		System.out.println(ribbonedShat.getName()+ribbonedShat.getDescirption()+ribbonedShat.getPrice());
	}

}
