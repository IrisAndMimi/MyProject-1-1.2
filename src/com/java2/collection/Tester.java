package com.java2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(1);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
//		Hash有自己特別的排序方式
		set2.add("Ris");
		set2.add("mimi");
		set2.add("Iris");
		set2.add("Iris");
		System.out.println(set2);
//		set不會重覆
		
		Map<String, String> stocks = new TreeMap<>();
		stocks.put("87", "Iris");
		stocks.put("8787", "Mimi");
		System.out.println(stocks);
	}

}
