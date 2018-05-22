package com.java2.snowing;

import java.util.Random;

public class Snow extends Thread{
	Random rdm = new Random();
	int x;
	int y = 800;
	public Snow(){
		x = rdm.nextInt(60);
	}
	
	@Override
	public void run() {
		for (int i = 800; i > 0; i--) {
//			System.out.println(getName()+":"+x+","+y);
			y = y--;
			int movement = rdm.nextInt(3)-1;
			x = x-movement;
			System.out.println(new String(new char[x]).replace("\0"," "));
			System.out.println("*");
		}
	}
	
	
}
