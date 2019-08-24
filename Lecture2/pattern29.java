package github_lecture2;

public class pattern29 {

	public static void main(String[] args) {
		int n=5;
		int val=1;
		int nst=1;
		int nsp=n-1;
		int rows=1;
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
				if(cst==1 || cst==nst)
				{
					System.out.print(val);
					cst++;
				}
				else
				{
					System.out.print("0");
					cst++;
				}
				
			}
			System.out.println();
			rows++;
			nst+=2;
			nsp--;
			val++;
		}
	}
}
