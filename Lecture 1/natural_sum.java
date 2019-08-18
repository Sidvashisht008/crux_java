package github_Lecture1;

import java.util.Scanner;

public class natural_sum {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of terms");
		int n=s.nextInt();
		int sum=0;
		int i=1;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		s.close();
	}
}