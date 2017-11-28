package com.MimiAndIris;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		System.out.print("請輸入數字: ");
		Scanner scanner = new Scanner(System.in);
		String UsrNum = scanner.nextLine();
		int n = Integer.parseInt(UsrNum);
		
		int i = 1;
		while(i<=n){
			System.out.print(i+" ");
			i = i+1;
		}
		
	}
	
}
