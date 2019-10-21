package lecture10;

public class all_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=all(new int[]{1,2,1,3,1,5}, 1, 0, 0);
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
	public static int[] all(int[] arr, int item, int vidx, int cnt) {

		if(vidx==arr.length) {
			int[] arr2=new int[cnt];
			return arr2;
		}
		
		if (arr[vidx] == item) {
			int[] ne=all(arr, item, vidx + 1, cnt+1);
			ne[cnt]=vidx;
			return ne;
		}
		else {
			int[] ne=all(arr,item,vidx+1,cnt);
			return ne;
		}
	}
}
