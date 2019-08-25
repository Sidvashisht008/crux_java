package revision;

public class x_pattern {

	public static void main(String[] args) {
		int n=19;
		int rows=1;
		while(rows<=n)
		{
			int cst=1;
			while(cst<=n)
			{
				if(cst==rows)
				{
					System.out.print("*");
				}
				else if(rows+cst==n+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				cst++;
			}
			System.out.println();
			rows++;
		}
	}
}
