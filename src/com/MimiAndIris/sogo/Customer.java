package com.MimiAndIris.sogo;

public class Customer {
	int amount;
	float discount = 0.95f;
	public Customer(){
	}
	public Customer(int amount){
		this.amount = amount;
	}
	public void print(){
		int total = (int)(amount*discount);
		System.out.println(total);

	}
}
