package exercises;

import java.util.*;
public class JavaIterator{

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
	   ArrayList mylist = new ArrayList();
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int m = sc.nextInt();
	   for(int i = 0; i < n; i++){		//adds integers to mylist(arraylist)
		   mylist.add(sc.nextInt());
	   }
	   
	   mylist.add("###");
	   for(int i = 0; i < m; i++){		//adds Strings to mylist(arraylist)
		   mylist.add(sc.next());
	   }
	   
	   Iterator it = func(mylist);		//calls function func with mylist parameter which returns iterator
	   while(it.hasNext()){				
		   Object element = it.next();			
		   System.out.println((String)element);	//casts element to String and prints it
	   }
   }
}
