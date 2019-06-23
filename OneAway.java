public class OneAway {
	
	public static boolean oneAway(String s1,String s2){
		
		if (s1 == null || s2 == null ) {
			return false;
		}
		String str1 = s1.length() < s2.length() ? s1 : s2;
		String str2 = s1.length() < s2.length() ? s2 : s1;
		int index1 = 0;
		int index2 = 0;
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		boolean foundDiff = false;
		while (index1 < s1.length() && index2 < s2.length()) {
			if (chars1[index1] != chars2[index2] ) {
				if (foundDiff) {
					return false;
					
				}
				foundDiff = true;
				if (chars1.length == chars2.length) {
					index1++;
				}
			} else {
				index1++;
			}
			index2++;
		}
		return true;		
	}

	public static void main(String[] args) {

		System.out.println(oneAway("pale", "ple"));		

	}

}
