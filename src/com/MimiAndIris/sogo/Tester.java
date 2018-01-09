package com.MimiAndIris.sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
		ArrayList list = new ArrayList();
		list.add(94);
		list.add(87);
		list.add("幫"+list.get(1)+"QQ");
		String n = (String)list.get(2);
//		System.out.println(n);
		System.out.println(list.size()+"是陣列大小");
		for (int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
/*程式分隔*/System.out.println();
//		Customer nc = new Customer(1000);
//		System.out.print(nc.amount+" ");
//		nc.print();
//		
//		SliverCustomer sc = new SliverCustomer(1000);
//		System.out.print(sc.amount+" ");
//		sc.print();
//		
//		GoldenCustomer gc = new GoldenCustomer(1000);
//		System.out.print(gc.amount+" ");
//		gc.print();
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1000));
		customers.add(new SliverCustomer(1000));
		customers.add(new GoldenCustomer(1000));
		for (int i=0; i<customers.size(); i++){
			System.out.print(customers.get(i).amount+" ");
			customers.get(i).print();
		}
	}

}
