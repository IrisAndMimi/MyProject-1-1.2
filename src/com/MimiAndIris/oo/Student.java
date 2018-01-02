package com.MimiAndIris.oo;

public class Student {
	/* public誰都能用
	 * private只有這個class能使用
	 * 沒寫 在同一個package才能用
	 * 但是protected能讓繼承使用 	*/
	private int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;
	
	public Student(){
		
	}
	public Student(String name,int english,int math,int chinese){
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	public Student(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println(pass);
		System.out.println(english+ "\t" +math +"\t"+chinese);
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	}
	
}
