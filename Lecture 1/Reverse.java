package github_Lecture1;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. you want to reverse");
		int n=s.nextInt();
		int digit=0,ans=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			ans=ans*10+digit;
		}
		System.out.println("reverse of no. is "+ans);
		s.close();
	}

}