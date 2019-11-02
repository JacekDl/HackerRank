package exercises;

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> values = new ArrayList<Integer>();
    	int numberOfValuesToRead = sc.nextInt();
    	while(numberOfValuesToRead-- > 0) {
    		Integer nextValue = sc.nextInt();
    		values.add(nextValue);
    	}
    	
    	
    	int numberOfQueriesToRead = sc.nextInt();
    	sc.nextLine();
    	
    	while(numberOfQueriesToRead-- > 0) {
    		String queryType = sc.nextLine();
    		if(queryType.compareTo("Insert") == 0) {
    			int index = sc.nextInt();
    			Integer valueToInsert = sc.nextInt();
    			//sc.nextLine();
    			values.add(index, valueToInsert);
    		}else if(queryType.compareTo("Delete") == 0) {
    			int indexToDelete = sc.nextInt();
    			//sc.nextLine();
    			values.remove(indexToDelete);
    		}
    		sc.nextLine();
    	}
    	
    	sc.close();
    	for(Integer i : values) System.out.print(i + " ");
    	
    	
    	//DIFFERENCE BETWEEN NEXT() AND NEXTLINE() METHODS
    	/*Scanner sc2 = new Scanner(System.in);
    	String myName = sc2.next();
    	//sc2.nextLine();
    	if(myName.compareTo("Jacek") == 0) System.out.println("OK");
    	String myName2 = sc2.nextLine();
    	if(myName2.compareTo("Jacek") == 0) System.out.println("OK2");
    	else System.out.println("Not OK2");
    	sc2.close();*/
    }
}

