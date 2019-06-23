/*
Qquestion :
String Rotation:Assumeyou have a method isSubstringwhich checks if one word is a substring
of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
*/

public class StringRotation {
	
	public static boolean stringRotation(String s1, String s2){
		
		if(s1==null || s2==null){
			return false;
		}
		
		if(s1.length()==s2.length() && s1.length()>0){
			
			String new_s1= s1.concat(s1);
			
			return isSubString(new_s1, s2);
		}
		return false;
	}
	
	public static boolean isSubString(String s1,String s2){
		
		return s1.indexOf(s2)>=0;
	}

	public static void main(String[] args) {
		
		String s1 ="waterbottle";
		String s2 ="erbottlewat";
		
		System.out.println(stringRotation(s1, s2));
	}

}
