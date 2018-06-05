package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("vending.txt");
			BufferedReader br = new BufferedReader(fr);
			String[] ary = br.readLine().split(","); 
			for (int i = 0; i < ary.length; i++) { 
				System.out.println(ary[i]); 
			} 

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
