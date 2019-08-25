package github_lecture3;

public class inverse_of_number {

	public static void main(String[] args) {
		int n=3214;
		int pos=1;
		int rem=0;
		int ans=0;
		while(n>0)
		{
			rem=n%10;
			ans=ans+pos*(int)Math.pow(10, rem-1);
			n=n/10;
			pos++;
		}
		System.out.println(ans);
	}
}
