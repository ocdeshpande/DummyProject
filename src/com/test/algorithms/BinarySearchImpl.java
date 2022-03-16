package com.test.algorithms;

public class BinarySearchImpl {

	public int searchBinary(Integer[] inputArray, int element) {
		// TODO Auto-generated method stub

		int firstIndex = 0;
		int lastIndex = inputArray.length - 1;

		while (firstIndex <= lastIndex) {
			int midIndex = (firstIndex + lastIndex) / 2;

			if (inputArray[midIndex] == element) {
				return midIndex;
			}

			else if (inputArray[midIndex] < element) {
				firstIndex = midIndex + 1;
			}

			else if (inputArray[midIndex] > element) {
				lastIndex = midIndex - 1;
			}
		}

		return -1;

	}

}
