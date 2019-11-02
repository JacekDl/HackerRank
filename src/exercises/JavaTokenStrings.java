package exercises;

import java.io.*;
import java.util.*;

public class JavaTokenStrings {

	    public static void main(String[] args) {
	        
	       String s = "                ";
	       s = s.concat("!");
	       String d = s + "!";
	       // Write your code her
 	       String[] splitString = s.trim().split("[ !,?._'@]+");
 	       
 	       System.out.println(splitString.length);
 	       for(String i : splitString) System.out.println(i);
	    }
	}

