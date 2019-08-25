package github_lecture3;

import java.util.Scanner;

public class anybase_to_decimal {

	public static void main(String[] args) {
		System.out.println("Enter any base no. you want to convert to decimal");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter source");
		int src=s.nextInt();
		int rem=0,mul=1,ans=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			ans=ans+rem*mul;
			mul=mul*src;
		}
		System.out.println(ans);
	}
}
