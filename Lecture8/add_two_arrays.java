package github_lecture8;
import java.util.*;
public class sum_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {9,9,9,9};
		int[] arr2= {9,9};
		add(arr1,arr2);
	}
	public static void add(int[] arr1,int[] arr2)
	{
		int i=arr1.length-1;
		int j=arr2.length-1;
		int sum=0;
		int carry=0;
		ArrayList<Integer> arr3=new ArrayList<>();
		while(i>=0 || j>=0)
		{
			sum=carry;
			if(i>=0)
			{
				sum=sum+arr1[i];
			}
			if(j>=0)
			{
				sum=sum+arr2[j];
			}
			int rem=sum%10;
			carry=sum/10;
			arr3.add(0,rem);
			i--;
			j--;
		}
		if(carry!=0)
		{
			arr3.add(0,carry);
		}
		System.out.println(arr3);
	}

}
