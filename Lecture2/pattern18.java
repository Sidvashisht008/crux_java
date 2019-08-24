package github_lecture2;

public class pattern18 {

	public static void main(String[] args) {
		int n=7;
		int rows=1;
		int nst=1;
		int nsp=n/2;
		while(rows<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(rows<=n/2)
			{
				nst+=2;
				nsp--;
			}
			else
			{
				nst-=2;
				nsp++;
			}
			rows++;
		}
	}
}
