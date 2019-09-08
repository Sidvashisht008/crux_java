package lecture7;

//import java.util.Arrays;
public class insertion_sort {
	public static void main(String[] args) {
		int[] a = { 2, 3, 1, 5, 0 };
		sort(a);
		for (int val : a) {
			System.out.print(val + " ");
		
		}
//		Arrays.sort(a);
	}

	public static void sort(int[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			int temp = arr[cnt];
			int j = cnt - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
}
