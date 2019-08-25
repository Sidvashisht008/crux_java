package github_lecture3;

import java.util.Scanner;

public class decimal_to_anybase {

	public static void main(String[] args) {
		System.out.println("Enter decimal no. you want to convert to other base");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enter destination value");
		int src=s.nextInt();
		int rem=0,ans=0,mul=1;
		while(n>0)
		{
			rem=n%src;
			n=n/src;
			ans=ans+rem*mul;
			mul=mul*10;
		}
		System.out.println(ans);
	}
}
