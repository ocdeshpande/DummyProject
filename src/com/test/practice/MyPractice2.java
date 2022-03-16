package com.test.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyPractice2 {

	public static void main(String[] args) {
		MyPractice2 myPractice1 = new MyPractice2();
		MyPractice2 myPractice2 = new MyPractice2();
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<>();
		myList.add("Omkar");
		myList.add("Pavan");
		myList.add("Mihir");
		myList.add("Siddhant");
		myList.add("Deshpande");
		myList.add("Mandsorwale");
		myList.add("Mishra");

		List<String> myListSurName = new ArrayList<>();
		myListSurName.add("Deshpande");
		myListSurName.add("Joshi");
		myListSurName.add("Mandsorwale");
		myListSurName.add("Mishra");
		List<String> myOpList = myList.stream().filter(l1 -> myListSurName.stream().anyMatch(l2 -> l2.equals(l1)))
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		myOpList.forEach(l -> System.out.println(l));
	};

}
