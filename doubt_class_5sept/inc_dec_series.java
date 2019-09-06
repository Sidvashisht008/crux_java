package doubt_class;
import java.util.Scanner;
public class inc_dec {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int prev=s.nextInt();
		boolean isvalid=true;
		boolean isinc=false;
		while(t-->1)
		{
			int nnum=s.nextInt();
			if(nnum>prev)
			{
				isinc=true;
			}
			else if(nnum<prev && isinc)
			{
				isvalid=false;
				break;
			}
			else if(nnum==prev)
			{
				isvalid=false;
				break;	
			}
			prev=nnum;
		}
		System.out.println(isvalid);
	}
}
