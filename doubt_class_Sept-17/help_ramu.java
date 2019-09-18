package sorting;

import java.util.Scanner;

public class help_ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int c1 = s.nextInt();
			int c2 = s.nextInt();
			int c3 = s.nextInt();
			int c4 = s.nextInt();
			int nor = s.nextInt();
			int noc = s.nextInt();
			int[] rick = new int[nor];
			int[] cabs = new int[noc];
			for (int i = 0; i < nor; i++) {
				rick[i] = s.nextInt();
			}

			for (int i = 0; i < noc; i++) {
				cabs[i] = s.nextInt();
			}
			fare(rick, cabs, c1, c2, c3, c4);
		}
	}

	public static void fare(int[] rick, int[] cabs, int c1, int c2, int c3, int c4) {
		int fare1 = minfare(rick, c1, c2, c3);
		int fare2 = minfare(cabs, c1, c2, c3);
		System.out.println(Math.min(fare1 + fare2, c4));
	}

	public static int minfare(int[] arr, int c1, int c2, int c3) {
		int fare = 0;
		for (int i = 0; i < arr.length; i++) {
			fare += Math.min(arr[i] * c1, c2);
		}
		return Math.min(fare, c3);
	}
}
