package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        
            String IP = "255.250.250.250";
            System.out.println(IP.matches(new MyRegex().pattern));
            String number = "250";
            System.out.println(number.matches(new MyRegex().pattern2));
    }
}

//Write your code here
class MyRegex{
    //String pattern = "[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}";
	// String pattern = "([0-9]{1,3}\\.{1}){3}[0-9]{1,3}";
    //String pattern = "([0-2]{1}?[0-9]{1}?[0-9]{1}\\.{1}){3}[0-2]{1}?[0-9]{1}?[0-9]{1}";
    String pattern = "([0-9]\\.|00[0-9]\\.|[0-9][0-9]\\.|0[0-9][0-9]\\.|1[0-9]{2}\\.|2[0-4][0-9]\\.|25[0-5]{1}\\.){3}([0-9]|00[0-9]|[0-9][0-9]|0[0-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]{1})";

    //String pattern2 = "[0-2]{1}?[0-5]{1}?[0-5]{1}";
    String pattern2 = "[0-9]|00[0-9]|[0-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]";// that works
}
//\\|[0-9]{1}

