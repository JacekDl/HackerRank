package exercises;

//https://www.hackerrank.com/challenges/simple-addition-varargs/problem
class Add {

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