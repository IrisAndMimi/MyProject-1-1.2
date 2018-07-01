package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BingoMain {

	public static void main(String[] args) {
		FileReader fr;
		BufferedReader br;
		ArrayList<Integer> uchs,bgo;
//		使用者選中的賓果號碼,整張賓果卡
		Random rd = new Random();
		int ary,chsd,chsdval,tmp;
//	將讀取的第一行轉進int,被選擇交換的矩陣元素編號,被選擇交換的矩陣元素數值,暫存編號i數值
		try {
			fr = new FileReader("bingo.txt");
			br = new BufferedReader(fr);
			ary = Integer.parseInt(br.readLine());
			System.out.println(ary);
//		儲存選中號碼
			String[] usrchs = br.readLine().split(",");
			uchs = new ArrayList<Integer>();
			for(int i=0; i < usrchs.length; i ++){
				uchs.add(Integer.parseInt(usrchs[i]) );
			}
			System.out.println(uchs);
//		乾淨有序的賓果卡
			bgo = new ArrayList<Integer>();
			for(int i=1; i<ary+1;i++){
				bgo.add(i);
			}
//		洗牌
			for(int i=0; i < bgo.size(); i ++){
				chsd = rd.nextInt(ary-1);
				chsdval = bgo.get(chsd);
				tmp = bgo.get(i);
				bgo.set(i, chsdval);
				bgo.set(chsd, tmp);
			}
//		標記牌編號
//			for (int j=0; j < uchs.size(); j ++){
//				System.out.print(bgo.indexOf(uchs.get(j))+" ");
//				uchs.set(j, bgo.indexOf(uchs.get(j)));
//			}
//			System.out.println(uchs);
			
//		生牌+排版
			for (int i=0; i < bgo.size(); i ++){
				for (int j=0; j < uchs.size(); j ++){
					if(bgo.get(i)==uchs.get(j)) {
						System.out.print("*");
					}
				}
				if ((i+1)%5==0){
					System.out.println(bgo.get(i));
				}else{
					System.out.print(bgo.get(i)+"\t");
				}
			}
//		找位置
//			System.out.println();
//			System.out.println(bgo.indexOf(uchs.get(0)));
//			System.out.println(uchs.size());

			
		}catch (Exception e) {
			System.out.println(e);
		}
	}



}
