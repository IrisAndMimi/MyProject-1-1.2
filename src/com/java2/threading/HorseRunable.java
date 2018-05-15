package com.java2.threading;

public class HorseRunable implements Runnable {
	@Override
	public void run(){
		for(int i=0; i<=100; i++){
			System.out.println("R:"+i);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				System.out.println("叭叭拋");
				e.printStackTrace();
			}
			
		}
		
	}
}
