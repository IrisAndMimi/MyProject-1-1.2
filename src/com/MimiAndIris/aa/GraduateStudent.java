package com.MimiAndIris.aa;

import com.MimiAndIris.oo.Student;

public class GraduateStudent extends Student{
	int thesis;
	public GraduateStudent(){
		super();
	}
	
	@Override	//覆寫:只能放大方法範圍,不能縮小
	public void print(){
		super.print();
		System.out.println(pass);
		System.out.println(english+ "\t" +math +"\t"+chinese+"\t"+thesis);
	}
	@Override
	public int getAverage(){
		return (english+math+chinese+thesis)/4;
	}
	
}
