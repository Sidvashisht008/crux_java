package github_lecture2;

public class pattern16 {

	public static void main(String[] args) {
		int n=5;
		int rows=1;
		int nst=n;
		int nsp=n-1;
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
				nsp-=1;
			}
			else
			{
				nst++;
				nsp+=1;
			}
			rows++;
		}
	}
}
