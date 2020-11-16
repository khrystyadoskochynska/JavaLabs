package droidGame;

import droid.*;
import fight.*;
import java.util.Random;

public class DroidGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Attacker d1 = new Attacker();
		d1.setName("droid1");
		Droid d2 = new Defender();
		d2.setName("droid2");
		int r = rand.nextInt(10);
		//d1.strike(d2);
		//System.out.println(d2.getHealth());
		
		Fight fight = new Fight();
		fight.fight1to1(d1, d2);
	}
}
