package github_lecture3;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		System.out.println("Enter decimal no. you want to convert to binary");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
		int mul=1;
		int ans=0;
		while(n>0)
		{
			rem=n%2;
			n=n/2;
			ans=ans+rem*mul;
			mul=mul*10;
		}
		System.out.println(ans);
	}
}
