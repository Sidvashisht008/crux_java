package github_Lecture1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt(),i=2,flag=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			flag=2;
		}
		s.close();
		if(flag==1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}