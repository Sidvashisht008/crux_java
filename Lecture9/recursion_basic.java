package leccture9;

public class recursion_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print_series(5);
//		System.out.println(factorial(5));
//		System.out.println(pow(2, 3));
		System.out.println(fibo(7));
	}
	public static void print_series(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print_series(--n);
		System.out.println(n);
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		int temp=factorial(n-1);
		int f=n*temp;
		return f;
	}
	public static int pow(int a,int n) {
		if(n==0) {
			return 1;
		}
		int temp=pow(a,n-1);
		int p=2*temp;
		return p;
	}
	public static int fibo(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		int temp=fibo(n-1)+fibo(n-2);
		return temp;
	}
}	
