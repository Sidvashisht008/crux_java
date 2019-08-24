package github_lecture2;

public class pattern1 {

	public static void main(String[] args) {
		int n=5;
		int nst=5;
		int rows=1;
		while(rows<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				cst+=1;
				System.out.print("*");
			}
			System.out.println();
			rows++;
		}
	}
}
