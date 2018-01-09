package com.MimiAndIris.sogo;

public class SliverCustomer extends Customer {
	public SliverCustomer(int amount){
		super(amount);
		super.discount = 0.9f;
	}
//	@Override
//	public void print(){
//		int total = (int)(amount*discount);
//		System.out.println(total);
//
//	}
}
