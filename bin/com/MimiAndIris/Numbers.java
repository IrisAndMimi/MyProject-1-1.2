package com.MimiAndIris;

public class Numbers {

	public static void main(String[] args) {
		for (int i= 1; i<=13; i++){
			if(i%3==0){
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
