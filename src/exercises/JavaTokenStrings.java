package exercises;

//https://www.hackerrank.com/challenges/java-string-tokens/problem
public class JavaTokenStrings {

	    public static void main(String[] args) {
	        
	       String s = "            ";
	       s = s.concat("!");
 	       String[] splitString = s.trim().split("[ !,?._'@]+");
 	       
 	       System.out.println(splitString.length);
 	       for(String i : splitString) {
 	    	   System.out.println(i);
 	       }
	    }
	}

