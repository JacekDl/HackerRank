package exercises;

import java.util.*;

//https://www.hackerrank.com/challenges/java-1d-array/problem
public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
    	Integer current = 0;
    	ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
    	ArrayList<Integer> arraylist = new ArrayList<Integer>();
    	queue.add(current);			//add index No 0 to queue
    	arraylist.add(current);		//add index No 0 to arraylist
    	
    	while(!(queue.isEmpty())) {			//if queue is empty return false - not possible to get to the end of array
    		current = queue.poll();			//remove first element from queue
    		if(current + 1 >= game.length || current + leap >= game.length) return true;	//check if move forward or jump end up after the end of array
    																						//if false allows the following conditions to be checked
    		if(canJump(current, game, leap) && !(arraylist.contains(current + leap))) {		//check if possible to jump
    			queue.add(current + leap);		//add jump index to queue
    			arraylist.add(current + leap);	//add jump index to arraylist
    		}
    		if(canMoveForward(current, game) && !(arraylist.contains(current + 1))) {
    			queue.add(current + 1);
    			arraylist.add(current + 1);
    		}
    		if(current > 0 && (canMoveBackward(current, game) && !(arraylist.contains(current - 1)))) {
    			queue.add(current - 1);
    			arraylist.add(current - 1);
    		}
    	}
		return false;
    }

    private static boolean canJump(Integer current, int[] game, int leap) {
		if(game[current + leap] == 0) return true;
		else return false;
	}
    
    private static boolean canMoveForward(Integer current, int[] game) {
		if(game[current + 1] == 0) return true;
		else return false;
	}
    
    private static boolean canMoveBackward(Integer current, int[] game) {
		if(game[current - 1] == 0) return true;
		else return false;
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            
            System.out.println((canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


