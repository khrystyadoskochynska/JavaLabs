package droidGame;

import droid.*;
import fight.*;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class DroidGame {

	static int amountOfMembers = 3;
	static int i = 1;

	public static void main(String[] args) {

		Random rand = new Random();
		Attacker d1 = new Attacker();
		d1.setName("droid1");
		Droid d2 = new Defender();
		d2.setName("droid2");
		int r = rand.nextInt(10);
		// d1.strike(d2);
		// System.out.println(d2.getHealth());

		Fight fight = new Fight();
		fight.fight1to1(d1, d2);

		Droid[] team1 = new Droid[amountOfMembers]; 
		Droid[] team2 = new Droid[amountOfMembers];
		
		System.out.println("Complect Team1: ");
		CreateTeam(team1);
		System.out.println(team1[0].getName());
		
		System.out.println("Complect Team2: ");
		CreateTeam(team2);
	}

	private static void CreateTeam(Droid[] team) {
		Scanner in = new Scanner(System.in);

		int selectedDroidTeam;
		
		for (int i = 0; i < amountOfMembers; i++) {

			System.out.println("Choose fighter #" + i + " of Team: ");
			System.out.println("Avaliable fighter: \n1-Attacker \n2-Defender \n3-Invulnurable \n");
			selectedDroidTeam = in.nextInt();
			while (selectedDroidTeam < 1 || selectedDroidTeam > 3) {
				System.out.println("Wrong fighter's number has been selected. Rechoose it: ");
				selectedDroidTeam = in.nextInt();
			}
			System.out.println("Input fighter's name\n");

			switch (selectedDroidTeam) {

			case 1:
				team[i] = new Attacker();
				break;
			case 2:
				team[i] = new Defender();
				break;
			case 3:
				team[i] = new Invulnarable();
				break;
			}
			
			 //name= in.nextInt();
			 team[i].setName(in.next());
			 
		}
	}
}
