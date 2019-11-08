package exercises;

//https://www.hackerrank.com/challenges/linkedin-practice-nested-logic/problem
public class NestedLogic {

	public static void main(String[] args) {
		int Da = 9;
		int Ma = 6;
		int Ya = 2015;
		int De = 6;
		int Me = 6;
		int Ye = 2015;
		
		int fine = 0;
		if(Ya < Ye) fine = 0;
		else if (Ya > Ye) fine = 10000;
		else {
			if(Ma < Me) fine = 0;
			else if (Ma > Me) fine = (Ma - Me)*500;
			else {
				if(Da <= De) fine = 0;
				else fine = (Da - De) * 15; 
			}
		}
		System.out.println(fine);
	}
}
