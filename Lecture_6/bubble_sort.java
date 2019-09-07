package github_lecture6;

public class bubble_sort {

	public static void main(String[] args) {
		int[] A = { 6, 5, 4, 3, 10, 2, 1 };
		sort(A);
		for (int val : A) {
			System.out.print(val + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = 1;
				}

			}
			if (flag == 0) {
				break;
			}
		}
	}

}
