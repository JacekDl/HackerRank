package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.hackerrank.com/challenges/java-covariance/problem

//TODO Jacek - this problem is in general more complicated and interesting at once, please
//remind me to send you some slides about it :)
class Flower {
	String whatsYourName() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower{
	@Override
	String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower{
	@Override
	String whatsYourName() {
		return "Lily";
	}
}

class Region {
	Flower yourNationalFlower() {
		//TODO Jacek simply: return new Flower(); --> DONE
		return new Flower();
	}
}

class WestBengal extends Region{
	Jasmine yourNationalFlower() {
		return new Jasmine();
	}
}

class AndhraPradesh extends Region{
	Lily yourNationalFlower() {
		return new Lily();
	}
}


public class CovariantReturnTypes {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine().trim();
		Region region = null;
		
		//TODO Jacek
		// try to play with:
		// List<Flower> l = Lists.newArrayList(new Jasmine(), new Lily());
		// l.foreach(f -> {f.whatYourName())}; - why it works?
		// and why List<Jasmine> l2 = Lists.newArrayList(new Flower()) should not?

		switch (s) {
			case "WestBengal":
				region = new WestBengal();
				break;
			case "AndhraPradesh":
				region = new AndhraPradesh();
				break;
				//TODO Jacek handle default: <...> --> DONE
			default:
				region = new Region();
				break;
		}
		
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());
	}
}
