package com.MimiAndIris;

import java.util.Scanner;

public class GameTester2 {

	public static void main(String[] args) {
		int pos = 0;
		int row = 3;
		int col = 5;
		int n = 87;
		int hp = 100;
		boolean gamovr = false;
		
		while(n!=5&&gamovr==false){
			if (hp<=0){
				System.out.println("GG囉");
				gamovr = true;
			}
			if (pos<=row*col-1&&gamovr==false){
			Scanner scanner = new Scanner(System.in);
			System.out.println("目前所在位置: "+pos);
			String UsrAct = scanner.nextLine();
			n = Integer.parseInt(UsrAct);
				switch(n){
				case 2:
					System.out.println("向下");
					if ((pos/col)<row-1){
						pos = pos+col;
						System.out.println(pos);
					}else{
						hp = hp-30;
						System.out.println("減血30,血量剩餘: "+hp);
					}
					break;
				case 4:
					System.out.println("向左");
					if ((pos%col)!=0){
						pos = pos-1;
						System.out.println(pos);
					}else{
						hp = hp-30;
						System.out.println("減血30,血量剩餘: "+hp);
					}
					break;
				case 6:
					System.out.println("向右");
					if ((pos%col)!=(col-1)){
						pos = pos+1;
						System.out.println(pos);
					}else{
						hp = hp-30;
						System.out.println("減血30,血量剩餘: "+hp);
					}
					break;
				case 8:
					System.out.println("向上");
					if (pos/col>0){
						pos = pos-col;
						System.out.println(pos);
					}else{
						hp = hp-30;
						System.out.println("減血30,血量剩餘: "+hp);
					}
					break;
				case 5:
					System.out.println("Bye");
					break;
				}
			}else if (pos>row*col-1){
				System.out.println("客官怎辦到的");
			}
		}
//		if (pos<=row*col-1){
////			下
//			if ((pos/col)<row-1){
//				pos = pos+col;
//			}
////			上
//			if (pos/col>0){
//				pos = pos-col;
//			}
////			左
//			if ((pos%col)!=0){
//				pos = pos-1;
//			}
////			右
//			if ((pos%col)!=(col-1)){
//				pos = pos+1;
//			}
//		}else if (pos>row*col-1){
//			System.out.println("客官怎辦到的");
//		}

		
		
	}

}
