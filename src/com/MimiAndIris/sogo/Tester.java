package com.MimiAndIris.sogo;

public class Tester {

	public static void main(String[] args) {
		Customer nc = new Customer(1000);
		System.out.print(nc.amount+" ");
		nc.print();
		
		SliverCustomer sc = new SliverCustomer(1000);
		System.out.print(sc.amount+" ");
		nc.print();
	}

}
