package com.test.algorithms;

import java.util.Arrays;

public class AlgoImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BubbleSort
		BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
		Integer[] sortedArr = bubbleSortImpl.bubbleSort(new Integer[] { 16, 12, 22, 99, 25 });

		Arrays.asList(sortedArr).forEach(e -> System.out.println(e));
		// BinarySearch
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		System.out.println("Number is at position: " + binarySearchImpl.searchBinary(sortedArr, 12));
	}

}