package github_lecture2;

public class pattern12 {

	public static void main(String[] args) {
		int n=5;
		int rows=1;
		int nst=1;
		int nsp=n-1;
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
				if(cst%2!=0)
				{
					System.out.print("*");
					cst++;
				}
				else
				{
					System.out.print("!");
					cst++;
				}
			}
			System.out.println();
			rows++;
			nsp--;
			nst+=2;
		}
  }
}
