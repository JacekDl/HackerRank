package exercises;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/phone-book/problem
class JavaMap{
	private static Scanner in = new Scanner(System.in);

	public static void main(String []argh)
	{
		Map<String, Integer> phoneBook = new HashMap<>();
		int n = in .nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in .nextLine();
			int phone=in .nextInt();
			in .nextLine();
			phoneBook.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in .nextLine();
			if(phoneBook.containsKey(s)) {
				System.out.println(s + "=" +phoneBook.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
	}
}

