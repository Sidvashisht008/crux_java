package github_lecture2;
public class pattern7 {
	public static void main(String[] args) {
		int n=5;
		int nst=n;
		int rows=1;
		while(rows<=n)
		{
			int cst=1;
			if(rows==1 || rows==n)
			{
				while(cst<=nst)
				{
					System.out.print("*");
					cst++;
				}
			}
			else
			{
				while(cst<=nst)
					if(cst==1 || cst==nst)
					{
						System.out.print("*");
						cst++;
					}
					else
					{
						System.out.print(" ");
						cst++;
					}
			}
			System.out.println();
			rows++;
		}
	}
}
