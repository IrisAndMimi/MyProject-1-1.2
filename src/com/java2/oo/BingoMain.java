package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BingoMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		BufferedReader br;
		Random rd = new Random();
		int ary,chsd,chsdval,tmp;
//	將讀取的第一行轉進int,被選擇交換的矩陣元素編號,被選擇交換的矩陣元素數值,暫存編號i數值
		
		try {
			fr = new FileReader("bingo.txt");
			br = new BufferedReader(fr);
			ary = Integer.parseInt(br.readLine());
			System.out.println(ary);
			String[] usrchs = br.readLine().split(",");
			ArrayList<Integer> uchs = new ArrayList<Integer>();
			
			
			for(int i=0; i < usrchs.length; i ++){
				System.out.print(usrchs[i]+" ");
			}
			System.out.println();
			System.out.println(Arrays.binarySearch(usrchs, "10"));
			
//			int bgo[] = new int[]{};
			ArrayList<Integer> bgo = new ArrayList<Integer>();
			for(int i=1; i<ary+1;i++){
				bgo.add(i);
			}
			for(int i=0; i < bgo.size(); i ++){
				chsd = rd.nextInt(ary-1);
				chsdval = bgo.get(chsd);
				tmp = bgo.get(i);
				bgo.set(i, chsdval);
				bgo.set(chsd, tmp);
			}
			for(int i=0; i < bgo.size(); i ++){
				if ((i+1)%5==0){
					System.out.println(bgo.get(i));
				}else{
					System.out.print(bgo.get(i)+"\t");
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

	private static int bgo(int index) {

		return 0;
	}

}
