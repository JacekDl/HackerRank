package exercises;

//https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class JavaStringsIntroduction {

public static void main(String[] args) {
        String A = "hello";
        String B = "java";
        
        System.out.println(A.length()+ B.length());
        int answer = A.compareTo(B);
        if(answer > 0) System.out.println("Yes");
        else System.out.println("No");
        
        String A1 = A.substring(0, 1);
        String A2 = A.substring(1, A.length());
        String B1 = B.substring(0, 1);
        String B2 = B.substring(1, B.length());
        System.out.println(A1.toUpperCase() + A2 + " " + B1.toUpperCase() + B2);
        
        
    }

}
