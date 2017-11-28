package com.MimiAndIris;

import java.util.Scanner;

public class DayOfYear {

	public static void main(String[] args) {
		int n = 32;
		int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i=0; i<months.length; i++){
			if( n <= months[i]){
				System.out.println( (i+1)+"/"+n );
				break;
			}else{
				n = n-months[i];
			}
		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("請輸入數字: ");
//		String UsrNum = scanner.nextLine();
//		int n = Integer.parseInt(UsrNum);
//	
//		int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		for (int i : n ){
//			if(n>months[i]){
//				
//			}
//		}
//			System.out.println("這天是"+i+"月"+n+"日");
	}
		
	
}
