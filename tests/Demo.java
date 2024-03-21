package tests;

import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		boolean matchingstatus = Pattern.matches(".*Arun.*", "My name is Arun Motoori");
		
       if(matchingstatus) {
    	   
    	   System.out.println("matched");
       }
    	   else
    	   {
    		System.out.println("Not matched");
    	   }
       
      // boolean matchingstatus1 = Pattern.matches("[Jj]ava", "Java");
	 // boolean matchingstatus1 = Pattern.matches("ye[sp]", "yes");
     // boolean matchingstatus1 = Pattern.matches("[sfk]it", "kit");
      //boolean matchingstatus1 = Pattern.matches(".ava", "java");
       //boolean matchingstatus1 = Pattern.matches("[0-9]am", "5am");
      // boolean matchingstatus1 = Pattern.matches("[a-z]et", "yet");
       
       //boolean matchingstatus1 = Pattern.matches("[a-z][A-Z]et", "Yet");
       //boolean matchingstatus1 = Pattern.matches("[a-zA-Z0-9]et", "5et");
       //boolean matchingstatus1 = Pattern.matches("[^0-9]et", "Yet");
       //boolean matchingstatus1 = Pattern.matches("[se[a-z]", "sea");
       //boolean matchingstatus1 = Pattern.matches("s[^aeiou]t", "set");
       //boolean matchingstatus1 = Pattern.matches("\\dam", "9am");//d----[0-9]
       //boolean matchingstatus1 = Pattern.matches("\\Dam", "9am");//D----[^0-9]
      // boolean matchingstatus1 = Pattern.matches("[A-Za-z0-9_]am", "_am");//or \\wam
       //boolean matchingstatus1 = Pattern.matches("\\Wam", "_am");//or \\Wam
       //boolean matchingstatus1 = Pattern.matches("^My.*", "My name is Babitha");
       //boolean matchingstatus1 = Pattern.matches(".*Babitha$", "My name is Babitha");
       //boolean matchingstatus1 = Pattern.matches("^My.*Babitha$", "My name is Babitha");
       //boolean matchingstatus1 = Pattern.matches("^My.+Babitha$", "My name is Babitha");
       //boolean matchingstatus1 = Pattern.matches("^My.?Babitha$", "MyBabitha");
       //boolean matchingstatus1 = Pattern.matches("^My.{1}Babitha$", "My Babitha");
       //boolean matchingstatus1 = Pattern.matches("java|Java", "java");
      // boolean matchingstatus1 = Pattern.matches("[a-d[m-p]]", "a");
       //boolean matchingstatus1 = Pattern.matches("a-z&&[def]]", "e");
      // boolean matchingstatus1 = Pattern.matches("^My.{1}Babitha$", "My Babitha");
      // boolean matchingstatus1 = Pattern.matches("[a-z&&[^bc]]", "c");
      // boolean matchingstatus1 = Pattern.matches("[a-z&&[^m-p]]", "z"); 
      // boolean matchingstatus1 = Pattern.matches("[a-z&&[^bc]]", "c");
       //boolean matchingstatus1 = Pattern.matches("b?at", "bat");//or at will match
       //boolean matchingstatus1 = Pattern.matches("b+at", "bat");//or bbat bbbat bbbbat match
      // boolean matchingstatus1 = Pattern.matches("b*at", "bat");//at bat bbat bbbat match
       //boolean matchingstatus1 = Pattern.matches("b{2,}at", "bat"); bbat only match
       boolean matchingstatus1 = Pattern.matches("b{2,4}at", "bbat");//bbat bbbat bbbbat matches
       if(matchingstatus1) {
    	   
    	   System.out.println("matched");
       }
    	   else
    	   {
    		System.out.println("Not matched");
    	   }
       
	}

}
