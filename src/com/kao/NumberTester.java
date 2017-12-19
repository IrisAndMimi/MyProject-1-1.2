package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		int t = 0;
		while(t<99){
			t = t+3;
			System.out.print(t+" ");
			if  ( t%15 == 0){
				System.out.println();
			}
		}

	}

}
