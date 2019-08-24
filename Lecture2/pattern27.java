package github_lecture2;

public class pattern27 {

	public static void main(String[] args) {
		int n=5;
		int nsp=n-1;
		int nst=1;
		int rows=1;
		
		while(rows<=n)
		{	int val=1;
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				if(cst<=nst/2)
				{	System.out.print(val);
					val++;
					cst++;
				}
				else
				{
					System.out.print(val);
					cst++;
					val--;
				}
			}
			System.out.println();
			nst+=2;
			nsp--;
			rows++;
		}
	}
}
