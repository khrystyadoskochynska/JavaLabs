package droid;

public class Attacker extends Droid  {
	public Attacker() {
		
		health = 100;
		damage = 20;
		armor = 1;
		regeneration = 0;
	}

	// get the hit
	public void strike(Droid Enemy) {
		double currDamage = damage*1.5;
		Enemy.takeHit(currDamage);
	}

	public void takeHit(double levelHit) {
		health = health - levelHit;	
		System.out.println("Current level of health of "+this.name + "\tis\t" +this.health);
	}
}
