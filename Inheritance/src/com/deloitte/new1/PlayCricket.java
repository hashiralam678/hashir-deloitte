package com.deloitte.new1;

public class PlayCricket {

	public static void main(String[] args) {
		
		Bowler b1= new Bowler();
		b1.bowl();
		
		//FastBowlers a1=new FastBowlers();
		b1= new FastBowlers();
		b1.bowl();
		
		b1=new Spinner();
		b1.bowl();
	}

}
