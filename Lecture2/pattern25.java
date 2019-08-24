package github_lecture2;

public class pattern25 {

	public static void main(String[] args) {
		int n=5;
		int nsp=n-1;
		int nst=1;
		int rows=1;
		int val=1;
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
				System.out.print(val++);
				cst++;
			}
			System.out.println();
			nst+=2;
			nsp--;
			rows++;
		}
	}
}
