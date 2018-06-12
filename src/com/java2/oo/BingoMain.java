package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class BingoMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("bingo.txt");
			BufferedReader br = new BufferedReader(fr);
			int ary = Integer.parseInt(br.readLine()); 
//			System.out.println(ary);
			Random rd = new Random();
			
			int bgo[] = new int[]{};
//			ArrayList<Integer> bgo = new ArrayList<Integer>();
			for(int i=0; i<10;i++){
				bgo.add(i);
			}
			   for(int i=0; i < bgo.length; i ++){
			     int index = rd.nextInt(10);
			     int tmp = bgo(index);
			     bgo[index] = bgo[i];
			     bgo[i] = tmp;
			   }
			   for(int i=0; i < bgo.length; i ++){
				   if (i+1==5){
					   System.out.println(bgo[i]);
				   }else{
					   System.out.print(bgo[i]+" ");
				   }
			   }
			
		
			String[] ar = br.readLine().split(","); 
			
//			for (int i = 0; i < ar.length; i++) { 
//				System.out.println(ar[i]); 
//			} 
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
