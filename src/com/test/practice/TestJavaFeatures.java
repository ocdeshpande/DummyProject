package com.test.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TestJavaFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Set<String>> myList = new ArrayList<>();

		Set<String> mySet = new HashSet<>();
		mySet.add("a");
		mySet.add("b");
		mySet.add("c");

		Set<String> mySet2 = new HashSet<>();
		mySet2.add("a");
		mySet2.add("c");
		mySet2.add("b");
		mySet2.add("d");

		Set<String> mySet3 = new HashSet<>();
		mySet3.add("a");
		mySet3.add("b");
		mySet3.add("c");

		myList.add(mySet2);
		myList.add(mySet);
		myList.add(mySet3);

		Set<String> finalSet = myList.stream()
				.filter(myset -> (myList.stream().filter(myset2 -> !myset2.containsAll(myset)).count() > 0)).findAny()
				.orElse(null);

		if (Objects.isNull(finalSet)) {
			System.out.println("Set are same");
		} else {
			System.out.println("Set are not same");
			finalSet.stream().forEach(System.out::println);
		}

	}

}
