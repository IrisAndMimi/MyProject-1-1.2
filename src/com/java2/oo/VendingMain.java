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
			
			int count = Integer.parseInt(ary[0]);
			for (int i = 0; i < count; i++){
				int id = i+1;
				String name = ary[i*2+1];
				int price = Integer.parseInt(ary[i*2+2]);
				vm.drinks.add(new Drink(id, name, price));
			}
			vm.on();
			
//			for (int i = 0; i < ary.length; i++) { 
//				System.out.println(ary[i]); 
//				
//			} 
		} catch (Exception e) {
			System.out.println(e);
		}	
		
	}
	
}
