public class IsUnique {
	
	//approach : We are silply using indexOf function to check the existense of character
	//if character exits then funtion indexOf function will return "1" else "0";
	
	//Note :  In order to avoid conflict between upperCase and lowerCase letter make sure
	//you can first convert whole string in either upper & lower case and then
	//apply function. for example String s1= "rajuMUKE" it will return "rajuMUKE" as it is
	// as a ascii value is different for lower case 'u' & 'U'.

	public static void main(String[] args) {
		
	  String s1 = "RAJU";
	  String temp ="";
	  boolean isUnique = true;
	  for(int i=0;i<s1.length();i++){
		  if(temp.indexOf(s1.charAt(i))> 0){
			  isUnique = false;
			  break;
		  }
		  else{
			  temp+=s1.charAt(i);
		  }
	  }
	  
	  System.out.println(isUnique ? "True":"False");

	}

}
