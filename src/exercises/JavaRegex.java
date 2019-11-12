package exercises;

//https://www.hackerrank.com/challenges/java-regex/problem
class JavaRegex {
	
    public static void main(String[] args) {
            String IP = "255.250.250.250";
            System.out.println(IP.matches(new MyRegex().IPRules));
            String number = "250";
            System.out.println(number.matches(new MyRegex().rule));
    }
    
}




