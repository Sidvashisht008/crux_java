package lecture10;

import java.util.ArrayList;

public class board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=boardpath(0,10);
		System.out.println(arr);
		System.out.println(arr.size());
		
	}

	public static ArrayList<String> boardpath(int strt, int end) {

		if(strt==end) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		ArrayList<String> mr=new ArrayList<>();
		for (int i = 1; i < 7 && strt+i<=end; i++) {
			ArrayList<String> br=boardpath(strt + i, end);
			for(String val:br) {
				mr.add(i+val);
			}
		}
		return mr;
	}
}
