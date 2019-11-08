package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

//https://www.hackerrank.com/challenges/java-bitset/problem
public class JavaBitSet {
	
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
        		if(ins1 == 1) b1.and(b2);
        		else if(ins1 == 2) b2.and(b1);
        		
        	}else if(instruction.compareTo("OR") == 0) {
        		if(ins1 == 1) b1.or(b2);
        		else if(ins1 == 2) b2.or(b1);
        		
        	}else if(instruction.compareTo("XOR") == 0) {
        		if(ins1 == 1) b1.xor(b2);
        		else if(ins1 == 2) b2.xor(b1);
        		
        	}else if(instruction.compareTo("FLIP") == 0) {
        		if(ins1 == 1) b1.flip(ins2);
        		else if(ins1 == 2) b2.flip(ins2);
        		
        	}else if(instruction.compareTo("SET") == 0) {
        		if(ins1 == 1) b1.set(ins2); 
        		else if(ins1 == 2) b2.set(ins2);
        	}
        	System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
       sc.close();
    }
}


