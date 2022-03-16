package com.test.algorithms;

public class BubbleSortImpl {

	public Integer[] bubbleSort(Integer[] inputArray) {
		boolean isSorted = false;
		int temp;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < inputArray.length - 1; i++) {
				if (inputArray[i] > inputArray[i + 1]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = temp;
					isSorted = false;
				}
			}

		}
		return inputArray;
	}

}
