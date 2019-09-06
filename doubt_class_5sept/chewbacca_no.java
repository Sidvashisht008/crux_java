package doubt_class;
import java.util.Scanner;
public class chewbacca_no {
	public static long chew(long n)
	{
		long sum=0;
		long mul=1;
		while(n>0)
		{
			long rem=n%10; 
			if(n==9) {}
			else if(rem>=5)
			{
				rem=9-rem;
			}
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		System.out.println(chew(n));
	}
}
