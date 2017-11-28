package com.MimiAndIris;

import java.util.Scanner;

public class ScoreTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		String UsrNum = scanner.nextLine();
		int n = Integer.parseInt(UsrNum);
		int score = n/10;
			switch (score) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Failed");
				break;
			case 6:
				System.out.println("Pass");
				break;
			case 7:
				System.out.println("Good");
				break;
			case 8:
				System.out.println("Great");
				break;
			case 9:
			case 10:
				System.out.println("Excellent");
				break;
			default:
				break;
			}
	}
}
