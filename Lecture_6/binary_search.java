package github_lecture6;

public class binary_search {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 7, 9, 10, 20 };
		System.out.println(bin_search(A, -1));
	}

	public static int bin_search(int[] arr, int x) {
		int beg = 0;
		int end = arr.length - 1;
		while (beg <= end) {
			int mid = (beg + end) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}

		}
		return -1;
	}
}
