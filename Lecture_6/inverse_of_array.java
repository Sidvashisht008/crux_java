package github_lecture6;

public class inverse_of_array {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 0 };
		int[] ans = inverse(A);
		for (int val : ans) {
			System.out.print(val + " ");
		}
	}

	public static int[] inverse(int[] arr) {
		int[] b = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			b[arr[i]] = i;
		}
		return b;
	}

}
