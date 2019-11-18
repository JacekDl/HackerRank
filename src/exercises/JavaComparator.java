package exercises;

import java.util.*;

class JavaComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfPlayers = scan.nextInt();

		Player[] player = new Player[numberOfPlayers];
		Checker checker = new Checker();

		for(int i = 0; i < numberOfPlayers; i++){
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for(int i = 0; i < player.length; i++){
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
	
}
