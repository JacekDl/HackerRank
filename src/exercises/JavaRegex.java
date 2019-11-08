package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-regex/problem
class JavaRegex{
    public static void main(String[] args){
            String IP = "255.250.250.250";
            System.out.println(IP.matches(new MyRegex().pattern));
            String number = "250";
            System.out.println(number.matches(new MyRegex().pattern2));
    }
}

class MyRegex{
    String pattern = "([0-9]\\.|00[0-9]\\.|[0-9][0-9]\\.|0[0-9][0-9]\\.|1[0-9]{2}\\.|2[0-4][0-9]\\.|25[0-5]{1}\\.){3}([0-9]|00[0-9]|[0-9][0-9]|0[0-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]{1})";
    String pattern2 = "[0-9]|00[0-9]|[0-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]";// that works
}


