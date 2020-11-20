package droid;

import java.util.Random;

public class Attacker extends Droid {
	public Attacker() {
		health = 100;
		damage = 20;
		armor = 1;
		regeneration = 0;
	}

	// get the hit
	public void strike(Droid Enemy) {
		Random rand = new Random();
		double power = rand.nextDouble();
		power = power + 1;
		double currDamage = damage * power;
		Enemy.takeHit(currDamage);
	}

	public void takeHit(double levelHit) {
		health = health - levelHit;
		String healthFormatted = String.format("%.2f", health);
		System.out.println("Current level of health of " + this.name + "\tis\t" + healthFormatted);
	}
}
