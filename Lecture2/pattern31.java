package github_lecture2;

public class pattern31 {

	public static void main(String[] args) {
		int n=5;
		int nst=5;
		int rows=1;
		int a=n;
		while(rows<=n)
		{	int val=5;
			int cst=1;
			while(cst<=nst)
			{
				if(cst==a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(val);
				}
				cst++;
				val--;
			}
			System.out.println();
			rows++;
			a--;
		}
	}
}
