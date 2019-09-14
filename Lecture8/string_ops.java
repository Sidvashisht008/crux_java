package github_lecture8;

public class String_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		System.out.println(isPalindrome(s));
		System.out.println();
		substr(s);
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void substr(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}
}
