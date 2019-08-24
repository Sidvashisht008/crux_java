package github_lecture2;

public class pattern21 {

	public static void main(String[] args) {
		int n=5;
		int rows=1;
		int nst=1;
		int nsp=2*n-3;
		while(rows<=n)
		{
			int cst=1;
			if(rows==n)
			{
				cst=2;
			}
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			nsp-=2;
			rows++;
		}
	}
}
