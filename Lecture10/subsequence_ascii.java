package lecture10;

import java.util.ArrayList;

public class subsequence_with_ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=subseq("abc");
		System.out.println(arr);
	}
	public static ArrayList<String> subseq(String str){
		
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		int ch1=(int)ch;
		
		ArrayList<String> br=subseq(ros);
		ArrayList<String> mr=new ArrayList<String>();
		for(String val:br) {
			mr.add(val);
			mr.add(ch+val);
			mr.add(ch1+val);
		}
		return mr;
	}

}
