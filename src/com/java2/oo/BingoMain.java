package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class BingoMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("bingo.txt");
			BufferedReader br = new BufferedReader(fr);
			int ary = Integer.parseInt(br.readLine()); 
//			System.out.println(ary);
			Random rd = new Random();
			
			String[] ar = br.readLine().split(","); 
			
//			for (int i = 0; i < ar.length; i++) { 
//				System.out.println(ar[i]); 
//			} 
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
