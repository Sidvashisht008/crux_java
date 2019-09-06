package doubt_class;
import java.util.Scanner;
public class pascal_triangle {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int rows=1;
			int nst=1;
			while(rows<=n)
			{
				int cst=1;
				while(cst<=nst)
				{
					System.out.print(pascal(rows-1,cst-1)+" ");
					cst++;
				}
				System.out.println();
				nst++;
				rows++;
			}
	}
	public static int pascal(int n,int r)
	{
		int mul=1;
		for(int i=0;i<r;i++) {
			mul=mul*(n-i)/(i+1);
		}
		return mul;
	}
}
