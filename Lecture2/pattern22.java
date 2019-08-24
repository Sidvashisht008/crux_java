package github_lecture2;

public class pattern22 {

	public static void main(String[] args) {
		int n=5;
		int nst=n;
		int nsp=-1;
		int rows=1;
		while(rows<=n)
		{
			int cst=1;
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
			if(rows==1)
			{
				cst=2;
			}
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst--;
			nsp+=2;
			rows++;
		}
	}
}
