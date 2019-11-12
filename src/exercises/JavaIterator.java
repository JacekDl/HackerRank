package exercises;

import java.util.*;

//https://www.hackerrank.com/challenges/java-iterator/problem
public class JavaIterator{

	private static Scanner sc;

	static Iterator func(ArrayList mylist){		//returns Iterator
		Iterator it = mylist.iterator();		//creates new Iterator
		while(it.hasNext()){
			Object element = it.next();				
			if(element instanceof String)	break;	//if element is String stop iteration
		}
		return it;		//returns the remainder of Iterator - position where iteration has stopped
	}
	
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
	   
	   //TODO Jacek always put there a type. Raw types are kind of dangerous and makes problems. Read about generics - probably Java 5(?) features.
	   @SuppressWarnings("rawtypes") //code from HackerRank - list to contain different datatypes --> how it can be done differently?
	   ArrayList mylist = new ArrayList();
	   sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int m = sc.nextInt();
	   for(int i = 0; i < n; i++){		//adds integers to mylist(arraylist)
		   mylist.add(sc.nextInt());
	   }
	   
	   mylist.add("###");
	   for(int i = 0; i < m; i++){		//adds Strings to mylist(arraylist)
		   mylist.add(sc.next());
	   }
	   
	   sc.close();
	   
	   Iterator it = func(mylist);		//calls function func with mylist parameter which returns iterator
	   while(it.hasNext()){				
		   Object element = it.next();			
		   System.out.println((String)element);	//casts element to String and prints it
	   }
   }
}
