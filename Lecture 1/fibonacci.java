package github_Lecture1;

import java.util.Scanner;

public class fibonacci_series {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of terms");
		int n=s.nextInt();
		int a=0,b=1,c=1,temp=0;
		while(c<=n)
		{
			System.out.print(a+" ");
			temp=a;
			a=b;
			b=temp+b;
			c++;
		}
		s.close();
	}
}