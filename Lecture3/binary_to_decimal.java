package github_lecture3;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		System.out.println("Enter binary no. you want to convert to decimal");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int mul=1;
		int rem=0;
		int ans=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			ans=ans+rem*mul;
			mul=mul*2;
		}
		System.out.println(ans);
	}
}
