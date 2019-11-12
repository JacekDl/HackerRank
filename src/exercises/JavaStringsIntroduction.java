package exercises;

//https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class JavaStringsIntroduction {

public static void main(String[] args) {
        String stringA = "hello";
        String stringB = "java";
        
        System.out.println(stringA.length()+ stringB.length());
        int answer = stringA.compareTo(stringB);
        if(answer > 0) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
        String firstLetterOfA = stringA.substring(0, 1);
        String remainderOfA = stringA.substring(1, stringA.length());
        String firstLetterOfB = stringB.substring(0, 1);
        String remainderOfB = stringB.substring(1, stringB.length());
        System.out.println(firstLetterOfA.toUpperCase() + remainderOfA + " " + firstLetterOfB.toUpperCase() + remainderOfB);
        
        
    }

}
