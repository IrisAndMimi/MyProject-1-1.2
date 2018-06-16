package com.java2.oo;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int tot = 0;
	int ckd=0;
	Scanner scanner = new Scanner(System.in);
	List<Drink> drinks = new ArrayList<>();
	public void on(){
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "." + drink.getName() + "---" + drink.getPrice());
		}
		System.out.println("請投入硬幣...");
		int coin = -1;
		String usrkin;
		while (coin != 0){
			coin = scanner.nextInt();
			switch(coin){
				case 0:
					break;
				default:
					tot = tot+coin;
					System.out.println("已投入:"+tot);
					coincheck();
					if(ckd>0) {
						chsdrink();
						break;
					}
					
			}
		}
	}
	public void coincheck(){
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			if (tot>=drink.getPrice()&& ckd==0){
				System.out.print("現在可選擇:"+drink.getName());
				ckd=1;
			}else if(tot>=drink.getPrice()&& ckd!=0) {
				System.out.print(" or "+drink.getName());
				ckd=2;
			}
		} 
	}
	public void chsdrink() {
			String usrkin;
			System.out.println();
			System.out.println("是否繼續投幣?");
			usrkin = scanner.next();
			if (usrkin=="y") {
				System.out.println("ouo");
			}else {
				System.out.println("-u-");
			}
		
	}
	
}
