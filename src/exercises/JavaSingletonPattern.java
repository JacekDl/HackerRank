package exercises;

//https://www.hackerrank.com/challenges/java-singleton/problem
class Singleton{
	public String str;
	private Singleton(){
		
	}
	
	static Singleton getSingletonInstance() {
		Singleton instance = new Singleton();
		return instance;
	}
	
}

public class JavaSingletonPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
