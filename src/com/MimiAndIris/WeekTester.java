package com.MimiAndIris;

import java.util.Scanner;

public class WeekTester {
	public static void main(String[] args) {
		System.out.print("請輸入數字: ");
		Scanner scanner = new Scanner(System.in);
		String UsrNum = scanner.nextLine();
		int n = Integer.parseInt(UsrNum);
		
//		int n = 1;
		switch(n){
		case 1:
			System.out.println("週一");
			break;
		case 2:
			System.out.println("週二");
			break;
		case 3:
			System.out.println("週三");
			break;
		case 4:
			System.out.println("週四");
			break;	
		case 5:
			System.out.println("週五");
			break;	
		case 6:
			System.out.println("週六");
			break;
		case 7:
			System.out.println("週日");
			break;
		default:
			System.out.println("有事逆?");
		}
		
	}
}
