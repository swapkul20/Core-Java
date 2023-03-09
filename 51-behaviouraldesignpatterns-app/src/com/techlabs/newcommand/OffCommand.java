package com.techlabs.newcommand;

public class OffCommand implements Command{
	
		private Television tv;

		public OffCommand() {
			this.tv = Television.getTelevisionInstance();
		}

		@Override
		public void execute() {
			if(tv.off()) {
				System.out.println("Television turned off.");
			}
			else {
				System.out.println("Televsision already turned off");
			}
		}

}
