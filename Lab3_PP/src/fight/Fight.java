package fight;
import droid.*;

public class Fight {
	
	    //public Droid fighter1;
	    //public Droid fighter2;

	    public void fight1to1(Droid fighter1 , Droid fighter2){
	        int counterOfRounds = 1;
	        while (fighter1.getHealth()>=0 && fighter2.getHealth()>= 0){
	            System.out.println("\t\t\t\tRound " + counterOfRounds );
	            fighter1.strike(fighter2);
	            fighter2.strike(fighter1);
	            counterOfRounds++;
	        }
	        
	        if (fighter1.getHealth()<=0 ){
	                System.out.println(fighter1.getName() + " is dead\n\nThe winner is " + fighter2.getName());
	            }
	            if (fighter2.getHealth()<=0 ){
	                System.out.println(fighter2.getName() + " is dead\n\nThe winner is " + fighter1.getName());
	            }
	    }

	
}
