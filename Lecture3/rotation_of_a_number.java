package github_lecture3;

import java.util.Scanner;

public class rotation_of_number {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter no. of rotations");
		int rot=s.nextInt();
		int count=0,temp=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		rot=rot%count;
		if(rot<0)
		{
			rot+=count;
		}
		int rem=0,ans=temp,i=0;
		
		while(i<rot)
		{	rem=temp%10;
			temp=temp/10;
			ans=temp+(rem*(int)Math.pow(10, count-1));
			i++;
			temp=ans;
		}
		System.out.println(ans);
	}
}
