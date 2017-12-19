package com.ibm;

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		int t = 0;
		while (t<=9){
			t = t+1;
			
			Random r = new Random();
			int n[]={r.nextInt(6)+1, r.nextInt(6)+1, r.nextInt(6)+1, r.nextInt(6)+1};
			for (int i : n ){
				System.out.print(i +" ");
			}
			if (n[0]!=n[1] && n[0]!=n[2] && n[0]!=n[3] && n[1]!=n[2] && n[1]!=n[3] && n[2]!=n[3]){
				System.out.print("*");
			}
				System.out.println();
		}
		
	}

}
