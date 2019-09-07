package github_lecture6;

public class reverse_array {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6 };
		reverse(A);
		for (int val : A) {
			System.out.print(val + " ");
		}
		System.out.println();
		reverse2(A, 0, 2);
		for (int val : A) {
			System.out.print(val + " ");
		}

	}

	public static void reverse2(int[] arr, int i, int j) {
		int lo = i;
		int hi = j;
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

	public static void reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}
}
