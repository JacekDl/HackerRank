package exercises;

//https://www.hackerrank.com/challenges/simple-addition-varargs/problem
class Add {

	/** TODO Jacek
	 * 1. Read about loggers, e.g. https://stackoverflow.com/questions/2750346/logger-vs-system-out-println
	 * 2. Read about different levels of logging (DEBUG, ERROR, ...), benefits etc
	 * 3. You can use e.g. log4j libary, just add it as external .jar or convert
	 * project to Maven/Gradle project and add dependency to it
	 * 4. (loggers has no benefit in such simple exercises like here, but this is must-to-know thing for u
	 */
	public void add(int ...a) {
		int len = a.length;
		int answer = 0;
		for(int i = 0; i < len - 1; i++) {
			answer += a[i];
			System.out.print(a[i] + "+");
		}
		answer += a[len-1];
		System.out.print(a[len - 1] + "=" + answer);
	}
}