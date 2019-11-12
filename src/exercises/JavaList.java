package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List<Integer> values = new ArrayList<Integer>();
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
    			values.add(index, valueToInsert);
    		}else if(queryType.compareTo("Delete") == 0) {
    			int indexToDelete = sc.nextInt();
    			values.remove(indexToDelete);
    		}
    		sc.nextLine();
    	}
    	
    	sc.close();
    	for(Integer i : values) {
    		System.out.print(i + " ");
    	}
    }
}

