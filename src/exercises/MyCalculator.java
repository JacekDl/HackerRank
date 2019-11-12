package exercises;

class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int value){
        int answer = 0;
        for(int i = 1; i <= value; i++) {
        	if(value % i == 0) {
        		answer += i;
        	}
        }
    	return answer;
    }
}