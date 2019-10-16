package leccture9;

public class recursion_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		array_print(new int[] {12,4,3,1},0);
//		System.out.println(max_array(new int[] {12,4,3,20,1},0));
		System.out.println(first_index(new int[] {2,4,1,20,1},0,1));
	}
	public static void array_print(int[] arr,int vidx) {
		if(vidx==arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		array_print(arr, vidx+1);
	}
	public static int max_array(int[] arr,int vidx) {
		if(vidx==arr.length-1) {
			return arr[vidx];
		}
		int m1=arr[vidx];
		int m2=max_array(arr,vidx+1);
		if(m2>m1) {
			m1=m2;
		}
		return m1;
	}
	public static int first_index(int[] arr,int vidx,int item) {
		
		if(vidx==arr.length) {
			return -1;
		}
		if(arr[vidx]==item) {
			return vidx;
		}
		int rr=first_index(arr,vidx+1,item);
		return rr;
	}
}
