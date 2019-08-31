package lecture3;
import java.util.Scanner;
public class prime_or_not {
	public static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(prime(n))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
