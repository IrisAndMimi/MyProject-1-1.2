package com.MimiAndIris.sogo;

public class GoldenCustomer extends SliverCustomer {
	int returnMoney;
	public GoldenCustomer(int amount){
		super(amount);
	}
	@Override
	public void print(){
		returnMoney = (int)((1-discount)*amount);
		int total = (int)(amount*discount);
		System.out.println(total+"+"+returnMoney);
	}
}
