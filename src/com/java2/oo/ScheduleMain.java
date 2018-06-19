package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleMain {
	List<Course> courses = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入星期(1-7):");
		int day = scanner.nextInt();
		System.out.print("請輸入節數(1-7):");
		int cls = scanner.nextInt();
		
	}

}
