package github_lecture6;

public class rotation_of_array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		rotate(arr, 3);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void rotate(int[] arr, int r) {
		r = r % arr.length;
		if (r < 0) {
			r += arr.length;
		}

		while (r-- > 0) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}

	}
}
