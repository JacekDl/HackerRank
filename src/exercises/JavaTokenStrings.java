package exercises;

import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/java-string-tokens/problem
public class JavaTokenStrings {

	    public static void main(String[] args) {
	        
	       String s = "                ";
	       s = s.concat("!");
	       String d = s + "!";
 	       String[] splitString = s.trim().split("[ !,?._'@]+");
 	       
 	       System.out.println(splitString.length);
 	       for(String i : splitString) System.out.println(i);
	    }
	}

