package github_lecture2;

public class pattern15 {

	public static void main(String[] args) {
		int n=5;
		int rows=1;
		int nst=n;
		int nsp=0;
		while(rows<=2*n-1)
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
			if(rows<n)
			{
				nst--;
				nsp+=2;
			}
			else
			{
				nst++;
				nsp-=2;
			}
			rows++;
		}
  }
}
