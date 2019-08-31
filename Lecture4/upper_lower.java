package lecture3;
import java.util.Scanner;
public class lower_upper {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
//		if(Character.isLowerCase(a))
//		{
//			System.out.print("lower");
//		}
//		else
//		{
//			System.out.println("upper");
//		}
		if(a>='a' && a<='z')
		{
			System.out.println("lower");
		}
		else if(a>='A' && a<='Z')
		{
			System.out.print("upper");
		}
		else
		{
			System.out.println("other character");
		}
}
}
