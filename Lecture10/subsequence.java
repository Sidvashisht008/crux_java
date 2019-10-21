package lecture10;

import java.util.ArrayList;

public class subsequence_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr=subseq("abc");
		System.out.println(arr);
	}
	public static ArrayList<String> subseq(String str){
		
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char a=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> arr=subseq(ros);
		ArrayList<String> mr=new ArrayList<String>();
		for(String val:arr) {
			mr.add(val);
			mr.add(a+val);
		}
		return mr;
	}
}
