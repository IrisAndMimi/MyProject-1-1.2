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
			System.out.println(br.readLine());
			
		} catch (Exception e) {

		}
	}

}
