package github_lecture2;

public class pattern13 {

	public static void main(String[] args) {
		int n=5;
		int nst=1;
		int rows=1;
		while(rows<=2*n-1)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(rows<n)
			{
				nst++;
			}
			else 
			{
				nst--;
			}
			rows++;
		}
		
  }
}
