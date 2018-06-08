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
				default:
					tot = tot+coin;
					System.out.println("已投入:"+tot);
					coincheck();
			}
		}
	}
	public void coincheck(){
		int ckd=0;
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			if (tot>=drink.getPrice()&& ckd ==0){
				System.out.print("現在可選擇:"+drink.getName());
				ckd=1;
			}else if(tot>=drink.getPrice()) {
				System.out.print(" or "+drink.getName());
			}
		}
		
	}
}
