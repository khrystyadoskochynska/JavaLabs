package droid;

public class Invulnarable extends Droid  {
	public Invulnarable() {
		health = 100;
		damage = 20;
		armor = 1;
		regeneration = 5;
	}

	// get the hit
	public void strike(Droid Enemy) {
		Enemy.takeHit(damage);
		health +=  health*regeneration/100;
	}

	public void takeHit(double levelHit) {
		health = health - levelHit;		
		String healthFormatted = String.format("%.2f", health);
		System.out.println("Current level of health of "+this.name + "\tis\t" +healthFormatted);
	}
	
}
