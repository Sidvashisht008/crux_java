package lecture7;

import java.util.Scanner;

public class jagged_array {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr=takeinput();
		display(arr);
	}

	public static int[][] takeinput() {
		System.out.println("enter row size");
		int rows = s.nextInt();
		int[][] arr = new int[rows][];
		for (int r = 0; r < arr.length; r++) {
			System.out.println("Enter no. of cols in" + r + " row");
			int col = s.nextInt();
			arr[r] = new int[col];
			for (int i = 0; i < col; i++) {
				arr[r][i] = s.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
