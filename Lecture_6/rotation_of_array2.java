package github_lecture6;

public class rotation_of_array2 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		rotate(a, 4);
		for (int val : a) {
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

	public static void rotate(int[] arr, int r) {
		r = r % arr.length;
		if (r < 0) {
			r += arr.length;
		}

		int a = arr.length - r;
		reverse2(arr, 0, a - 1);
		reverse2(arr, a, arr.length - 1);
		reverse2(arr, 0, arr.length - 1);
	}

}
