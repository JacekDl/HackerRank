package exercises;

import java.util.Comparator;

public class Checker implements Comparator<Player>{

	public int compare(Player one, Player two) {
		if(one.score > two.score) {
			return -1;
		}else if (one.score < two.score) {
			return 1;
		}else {
			if(one.name.compareTo(two.name) == -1) {
				return -1;
			}else if(one.name.compareTo(two.name) == 1) {
				return 1;
			}else {
				return 0;
			}
		}
	
	}

}
