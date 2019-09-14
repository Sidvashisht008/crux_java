package github_lecture8;

import java.util.*;

public class intersection_arraylist {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 5, 5, 7, 8 };
		int[] arr2 = { 1, 2, 4, 6, 7, 9 };
		intersection(arr1, arr2);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> arr3 = new ArrayList<>();
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				arr3.add(arr1[i]);
				i++;
				j++;
			}
		}
		System.out.println(arr3);
	}

}
