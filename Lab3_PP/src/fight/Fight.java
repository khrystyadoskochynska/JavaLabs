package fight;

import droid.*;

public class Fight {

	public void fight1to1(Droid fighter1, Droid fighter2) {
		int counterOfRounds = 1;
		while (fighter1.getHealth() >= 0 && fighter2.getHealth() >= 0) {
			System.out.println("\t\t\t\tRound " + counterOfRounds);
			fighter1.strike(fighter2);
			fighter2.strike(fighter1);
			counterOfRounds++;
		}

		if (fighter1.getHealth() <= 0 && fighter2.getHealth() <= 0) {
			System.out.println("\n" + fighter1.getName() + " is dead\n " + fighter2.getName() + " is dead\n ");
		} else {
			if (fighter1.getHealth() <= 0) {
				System.out.println("\n" + fighter1.getName() + " is dead\nThe winner is " + fighter2.getName());
			}
			if (fighter2.getHealth() <= 0) {
				System.out.println("\n" + fighter2.getName() + " is dead\nThe winner is " + fighter1.getName());
			}
		}
	}

	public void fightTeamtoTeam(Droid[] team1, Droid[] team2) {
		int readyToFightT1;
		int readyToFightT2;

		do {
			readyToFightT1 = -1;
			readyToFightT2 = -1;
			for (int i = 0; i < team1.length; i++) {
				if (team1[i].getHealth() > 0 && readyToFightT1 == -1) {
					readyToFightT1 = i;
				}
				if (team2[i].getHealth() > 0 && readyToFightT2 == -1) {
					readyToFightT2 = i;
				}
			}

			if (readyToFightT1 >= 0 && readyToFightT2 >= 0) {
				team1[readyToFightT1].strike(team2[readyToFightT2]);
				team2[readyToFightT2].strike(team1[readyToFightT1]);
			}

		} while (readyToFightT1 >= 0 && readyToFightT2 >= 0);
		if (readyToFightT1 < 0) {
			System.out.println("\nTeam1 has lost!");
		}
		if (readyToFightT2 < 0) {
			System.out.println("\nTeam2 has lost!");
		}
	}
}
