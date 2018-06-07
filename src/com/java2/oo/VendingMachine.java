package com.java2.oo;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int tot = 0;
	
	List<Drink> drinks = new ArrayList<>();
	
	public void on(){
		System.out.println("請投入硬幣...");
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "." + drink.getName() + "---" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int coin = -1;
		while (coin != 0){
			coin = scanner.nextInt();
			switch(coin){
				case 0:
					break;
				case 1:
					tot = tot+coin;
					System.out.println(tot);
			}
		}
	}
}
