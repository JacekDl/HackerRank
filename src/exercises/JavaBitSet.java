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
       int sizeOfSet = sc.nextInt();
       int numberOfQueries = sc.nextInt();
        
       BitSet firstSet = new BitSet(sizeOfSet);
       BitSet secondSet = new BitSet(sizeOfSet);
        
       while(numberOfQueries-- > 0) {
        	String typeOfQuery = sc.next();
        	int instr1 = sc.nextInt();
        	int instr2 = sc.nextInt();
        	
        	if(typeOfQuery.compareTo("AND") == 0) {
        		if(instr1 == 1) {
        			firstSet.and(secondSet);
        		}
        		else if(instr1 == 2) {
        			secondSet.and(firstSet);
        		}
        		
        	}else if(typeOfQuery.compareTo("OR") == 0) {
        		if(instr1 == 1) {
        			firstSet.or(secondSet);
        		}
        		else if(instr1 == 2) {
        			secondSet.or(firstSet);
        		}
        		
        	}else if(typeOfQuery.compareTo("XOR") == 0) {
        		if(instr1 == 1) {
        			firstSet.xor(secondSet);
        		}
        		else if(instr1 == 2) {
        			secondSet.xor(firstSet);
        		}
        		
        	}else if(typeOfQuery.compareTo("FLIP") == 0) {
        		if(instr1 == 1) {
        			firstSet.flip(instr2);
        		}
        		else if(instr1 == 2) {
        			secondSet.flip(instr2);
        		}
        		
        	}else if(typeOfQuery.compareTo("SET") == 0) {
        		if(instr1 == 1) {
        			firstSet.set(instr2); 
        		}
        		else if(instr1 == 2) {
        			secondSet.set(instr2);
        		}
        	}
        	System.out.println(firstSet.cardinality() + " " + secondSet.cardinality());
        }
       sc.close();
    }
}


