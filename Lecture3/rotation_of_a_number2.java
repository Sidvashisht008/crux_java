package github_lecture3;
import java.util.Scanner;
public class rotation_of_number2 {
	public static void main(String[] args) {
		System.out.println("Enter no.");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter no. of rotations");
		int rot=s.nextInt();
		int count=0;
		int m=n;
		while(m>0)
		{
			m=m/10;
			count++;
		}
		rot=rot%count;
		if(rot<0)
		{
			rot+=count;
		}
		int rem=0,ans=0;
		rem=n%(int)Math.pow(10, rot);
		n=n/(int)Math.pow(10, rot);
		ans=n+rem*(int)Math.pow(10, count-rot);
		System.out.println(ans);
	}
}
