package github_Lecture1;
import java.util.Scanner;
public class GCD {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no.");
		int n=s.nextInt();
		System.out.println("enter second number");
		int m=s.nextInt();
		int i=1,a=0;
		for(i=Math.min(n, m);i>=1;i--)
		{
			if(m%i==0 && n%i==0)
			{
				a=i;
				break;
			}
		}
		System.out.println("The GCD is "+a);
		s.close();
	}
}