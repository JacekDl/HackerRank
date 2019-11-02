package exercises;

import java.util.*;

public class QueuesAndStacks {
    // Write your code here.
	ArrayDeque<Character> queue = new ArrayDeque<>();
	ArrayDeque<Character> stack = new ArrayDeque<>();
	
	private void enqueueCharacter(char c) {
		queue.add(c);
	}
	
	private void pushCharacter(char c) {
		stack.push(c);
	}
	
	private Object dequeueCharacter() {
		char c = queue.removeFirst();
		return c;
	}

	private Object popCharacter() {
		char c = stack.pop();
		return c;
	}

	
	

    public static void main(String[] args) {
        String input = "ola";
        

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        
        /*for(char c : queue) System.out.print(c + " ");
        System.out.println();
        for(char c : stack) System.out.print(c + " ");
        System.out.println();*/

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	
}