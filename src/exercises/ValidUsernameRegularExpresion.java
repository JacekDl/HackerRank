package exercises;

class UsernameValidator {
    
    public static final String regularExpression = "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
}


//https://www.hackerrank.com/challenges/valid-username-checker/problem
public class ValidUsernameRegularExpresion {
	public static void main(String[] args) {
        String[] set = {"Julia","Samantha","Samantha_21", "1Samantha", "Samantha?10_2A",
        				"JuliaZ007", "Julia@007", "_Julia007"};

        for(String i : set) {
            String userName = i;

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
