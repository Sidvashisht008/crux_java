package github_lecture6;

public class reverse_array {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		reverse(A);
		for (int val : A) {
			System.out.print(val + " ");
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
