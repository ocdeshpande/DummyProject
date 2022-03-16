package com.test.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyPractice {
	static {
		System.out.println("Inside Static Block");
	}

	{
		System.out.println("Inside Normal Block");
	}

	public MyPractice() {
		System.out.println("Inside Constructor");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyPractice myPractice1 = new MyPractice();
		MyPractice myPractice2 = new MyPractice();
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<>();
		myList.add("Omkar");
		myList.add("Pavan");
		myList.add("Mihir");
		myList.add("Siddhant");

		// myList.forEach(name -> System.out.println(name));

		/*
		 * Comparator<String> compareMyList = new Comparator() {
		 * 
		 * @Override public int compare(Object o1, Object o2) { int result = 0; String
		 * name1 = (String) o1; String name2 = (String) o2; result =
		 * name1.compareTo(name2); return result; } };
		 */

		Comparator<String> compareMyList = (o1, o2) -> {

			int result = 0;
			String name1 = (String) o1;
			String name2 = (String) o2;
			result = name1.compareTo(name2);
			return result;

		};

		myList.sort(compareMyList);

		// myList.forEach(name -> System.out.println(name));

		Stream<String> myStream = myList.stream();
		myStream.filter(name -> name.startsWith("M")).map(name -> name.toUpperCase()).sorted(Comparator.naturalOrder())
				.collect(Collectors.toList()).forEach(name -> System.out.println(name));

		List<String> myListSurName = new ArrayList<>();
		myListSurName.add("Deshpande");
		myListSurName.add("Joshi");
		myListSurName.add("Mandsorwale");
		myListSurName.add("Mishra");

		List<List<String>> myListFullName = new ArrayList<>();
		myListFullName.add(myList);
		myListFullName.add(myListSurName);

		System.out.println(myListFullName.stream().count());

		myListFullName.stream().flatMap(listInner -> listInner.stream()).map(name -> name.toUpperCase())
				.sorted(Comparator.naturalOrder()).collect(Collectors.toList())
				.forEach(name -> System.out.println(name));

		HashMap<String, String> myHashMap = new HashMap<>();
		myHashMap.put("Omkar", "Deshpande");
		myHashMap.put("Pavan", "Joshi");
		myHashMap.put("Mihir", "Mnadsorwale");
		myHashMap.put("Mahesh", "Takalkar");
		myHashMap.put("Omi", "Deshpande");
		myHashMap.put("Akshata", "Anarase");

		Map<String, String> result = myHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		result.forEach((k, v) -> System.out.println("Key is " + k + " Value is " + v));
	};

}
