package github_lecture5;

import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ll=s.nextInt();
		int ul=s.nextInt();
		prime(ll,ul);
		armstrong(ll,ul);
	}
	
	public static void prime(int ll,int ul)
	{
		for(int i=ll;i<=ul;i++)
		{
			if(isprime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isprime(int n)
	{
		if(n==1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void armstrong(int ll,int ul)
	{
		for(int i=ll;i<=ul;i++)
		{
			if(isarm(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isarm(int n)
	{
		int temp=n;
		int count=0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		temp=n;
		int ans=0;
		while(temp>0)
		{
			int rem=temp%10;
			ans=ans+(int)Math.pow(rem, count);
			temp/=10;
		}
		if(ans==n)
		{
			return true;
		}
		return false;
	}
	
	
	
}
