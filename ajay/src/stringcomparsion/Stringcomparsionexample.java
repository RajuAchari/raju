package stringcomparsion;

public class Stringcomparsionexample {
       
	public static void main(String[] args) {
		String string1="Live Tech";
		System.out.println(string1);
		System.out.println(string1.charAt(2)); //get the index related char value
		char charAtIndex=string1.charAt(4);
		//get the index related char value declared of type char
		System.out.println("The value of the variable charAtIndex is:+CharAtindex");
		//getting the ASCII value of the index character-declared of type int
		 int charAtnewindex=string1.charAt(4);
		 System.out.println("charAtnewindex");
		  String string2="Live Tech";
		  String string3="Live tech";
		if(string2.equals(string3))//both string variable are compared for the exact match case
		  {	  
			  System.out.println("variable string2 and variable string3 are equal");
		  }
		else
		{
	      System.out.println("variable string2 and variable string3 are Not Equal");
		}
		 String string4="Testing Tools";
		 String string5="Testing tools";
		 if(string4.equalsIgnoreCase(string5))//Both string variable are compared for the exact match
			 //case ignoring the upper case and lower case letters
		 { System.out.println("variable string and variable string5 are equal");
	}
	else
	{
		System.out.println("variable string4 and variable string5 are Not Equal"); 
	}	 
		 String string6="Load Runner";
		 //variable value converting to all Upper case letters
		 String convertedstringToUppercase=string6.toUpperCase();
		 System.out.println("The string value string6 converted to upper case:"+convertedstringToUppercase);
		//variable value converting to all Loer case letter
		 String convertedstringToLowewrcase=string6.toLowerCase();
		 {
			 System.out.println("The string value string6 converted to Lower case:"+convertedstringToLowewrcase);
		 }
		 
		 //checking for the existance of the string value
		 
		 String string7="Live";
		 String string8="Live Tech";
		 if(string7.contains(string8))
		 {
			 System.out.println("Expected string is found-string7 contains string8");
		 }
		 else
		 {
			 System.out.println("Expected string Not found-string7 does not contains string8");
		 }
	}

		 
			 
			 
	
		 
}

	
