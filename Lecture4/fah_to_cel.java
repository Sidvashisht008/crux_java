package lecture3;

import java.util.Scanner;

public class fah_to_celsius{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int min=s.nextInt();
		int max=s.nextInt();
		int step=s.nextInt();
		for(int i=min;i<=max;i+=step)
		{
			int celsius=0;
			celsius=(int)((5/9.0f)*(i-32));
			System.out.println(i+" "+celsius);
		}
	}
}
