/*
Question : 
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
*/



public class StringCompressed {
	
	public static String stringCompression(String s1){
		
		
		StringBuilder sb = new StringBuilder();
		
		char currentChar =0;
		int count =1;
		
		for(int i=0;i<s1.length()-1;i++){
			/* Find current character and check with next character.
			 * If matches, increase the count else append the character
			 * and count. Reset the counter. */
			
			currentChar = s1.charAt(i);
			if(currentChar!=s1.charAt(i+1)){
				sb.append(currentChar);
				sb.append(count);
				count=1;
			}
			else{
				count++;
			}
		}
		/* There is no append happening for last set of characters,
		 * because if condition won't be true. Appending them here. */
		sb.append(currentChar);
		sb.append(count);
		
		/* if builder's length is less as compared to
		 * input, return builder's string else return input */
		if(sb.length()<s1.length()){
			return sb.toString();
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "aaabbccccdaa";
		
		System.out.println(stringCompression(s1));

	}

}
