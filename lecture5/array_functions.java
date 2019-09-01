package github_lecture5;

public class array {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
//		System.out.println(linser(arr,10));
//		System.out.println(max(arr));
//		System.out.println(max2(arr));
		max2(arr);
	}
	public static int linser(int []arr,int a)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	//second largest number
	
	public static void max2(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		int max1=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(max1<arr[j] && arr[j]!=max )
			{
				max1=arr[j];
			}
		}
	System.out.println(max1);
	}
}
