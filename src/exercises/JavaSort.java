package exercises;

import java.util.*;



//https://www.hackerrank.com/challenges/java-sort/problem
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();	
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		studentList.sort(Comparator.comparingDouble(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparingInt(Student::getId)); //TODO: complete the exercise --> DONE	
		
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
      	
      	in.close();
	}
}




