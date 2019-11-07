package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

//https://www.hackerrank.com/challenges/java-bitset/problem
public class JavaBitSet {
	
	/////	CONVERTS BITSET to INT
	/*private static void printSet(BitSet btset, int n) { 
		StringBuffer strbuff = new StringBuffer(n);
		for(int i = 0; i < n; i++) {
			if(btset.get(i) == true) strbuff.append('1');
			else strbuff.append('0');
		}
		String str = new String(strbuff);
		System.out.print(Integer.parseInt(str,2) + " ");
	}*/
	
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
        
       BitSet b1 = new BitSet(n);
       BitSet b2 = new BitSet(n);
        
       while(m-- > 0) {
        	String instruction = sc.next();
        	int ins1 = sc.nextInt();
        	int ins2 = sc.nextInt();
        	
        	if(instruction.compareTo("AND") == 0) {
        		System.out.print("After AND: ");
        		if(ins1 == 1) b1.and(b2);
        		else if(ins1 == 2) b2.and(b1);
        		
        	}else if(instruction.compareTo("OR") == 0) {
        		System.out.print("After OR: ");
        		if(ins1 == 1) b1.or(b2);
        		else if(ins1 == 2) b2.or(b1);
        		
        	}else if(instruction.compareTo("XOR") == 0) {
        		System.out.print("After XOR: ");
        		if(ins1 == 1) b1.xor(b2);
        		else if(ins1 == 2) b2.xor(b1);
        		
        	}else if(instruction.compareTo("FLIP") == 0) {
        		System.out.print("After FLIP: ");
        		if(ins1 == 1) b1.flip(ins2);
        		else if(ins1 == 2) b2.flip(ins2);
        		
        	}else if(instruction.compareTo("SET") == 0) {
        		System.out.print("After SET: ");
        		if(ins1 == 1) b1.set(ins2); 
        		else if(ins1 == 2) b2.set(ins2);
        	}
        	System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
       sc.close();
    }
}


