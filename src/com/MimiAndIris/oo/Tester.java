package com.MimiAndIris.oo;

import com.MimiAndIris.aa.GraduateStudent;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student("王小明", 55, 66, 77);
		Student stu2 = new Student("黃大為", 77, 88, 44);
//		Student stu = new Student("王小明");
//		stu.english = 55;
//		stu.math = 66;
//		stu.chinese = 77;
		
//		Student.pass = 50;
		stu1.pass = 50;
		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		System.out.println(stu1.name +":"+ avg);
		GraduateStudent gtsd = new GraduateStudent();
		gtsd.print();
	}

}
