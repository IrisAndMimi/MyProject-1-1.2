package com.ibm;

public class NineLazy {
	public void nine(){
		for (int n=2; n<=9 ;n++){
			if (a*n/10 ==0){
				System.out.print(n+" x "+a+" =  "+a*n);
			}else{
				System.out.print(n+" x "+a+" = "+a*n);
			}
			System.out.print("\t");
		}
	}

	public static void main(String[] args) {
		int a=0;
		while(a<3){
			a = a+1;
				for (int n=2; n<=9 ;n++){
					if (a*n/10 ==0){
						System.out.print(n+" x "+a+" =  "+a*n);
					}else{
						System.out.print(n+" x "+a+" = "+a*n);
					}
					System.out.print("\t");
				}
				System.out.println();
			}
		while(a<8){
			a = a+1;
			System.out.print("\t...");
			System.out.print("\t\t...");
			System.out.print("\t\t...");
			System.out.print("\t\t...");
			System.out.print("\t\t...");
			System.out.print("\t\t...");
			System.out.print("\t\t...");
			System.out.println("\t\t...");
		}
		
		while(a==8){
			a = a+1;
			for (int n=2; n<=9 ;n++){
				if (a*n/10 ==0){
					System.out.print(n+" x "+a+" =  "+a*n);
				}else{
					System.out.print(n+" x "+a+" = "+a*n);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
//		}
		}

}
