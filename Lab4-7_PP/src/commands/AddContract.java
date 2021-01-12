package commands;

import java.util.Scanner;
import java.util.logging.Logger;

import contracts.Contract;
import insurance.Insurance;
import insurance.RisksCoef;

public class AddContract implements Command {
	private Contract contract;
	private Logger log = Logger.getLogger(AddContract.class.getName());

	public AddContract(Contract contract) {
		this.contract = contract;
		log.info("constructor in AddContract");
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		log.info("Execute function in AddContract");
		char addNextRisk;
		int riskIndex;

		Scanner scanner = new Scanner(System.in);
				
		//contract.setID(134);
		System.out.println("Input your name and surname: \n");
		String clientName = scanner.nextLine();
		contract.setClientName(clientName);
		
		System.out.println("Input model of your car: \n");
		String carModel = scanner.nextLine();
		contract.setCarModel(carModel);

		System.out.println("Input production year of your car: \n");
		int productionYear = scanner.nextInt();
		contract.setProductionYear(productionYear);

		System.out.println("Input cost of your car (insurance coverage): \n");
		  double insuranceCoverage = scanner.nextDouble();
		  contract.setInsuranceCoverage(insuranceCoverage);
		  
		//System.out.println("Input amount of your drive experience: \n");
		//int drivingExp = scanner.nextInt();
		//contract.setDrivingExp(drivingExp);

		// contract.toString();

		do {

			System.out.println("Choose a risk type: \n");
			System.out.println("1-theft; \n 2-iatp; \n 3-roadAccident; \n 4-naturalDisaster; \n 5-withoutPolice; \n");
			riskIndex = scanner.nextInt();
			switch (riskIndex) {

			case 1:
				contract.addRisk(RisksCoef.theft);
				log.info("Risk theft added");
				break;
			case 2:
				contract.addRisk(RisksCoef.iatp);
				break;
			case 3:
				contract.addRisk(RisksCoef.roadAccident);
				break;
			case 4:
				contract.addRisk(RisksCoef.naturalDisaster);
				break;
			case 5:
				contract.addRisk(RisksCoef.withoutPolice);
				break;
				
			default:
				System.out.println("Your chosen option isn't correct. Try again. \n");
			}

			System.out.println("Would you like to add one more risk type? \n Press 'y' for yes; 'n' for no");
			addNextRisk = scanner.next().charAt(0);
			//System.out.println("Scanned addNextRisk = "+ addNextRisk);
			//addNextRisk = "yes";
		} while (addNextRisk == 'y');
		
		contract.calculateCoeficient();
		contract.calculateCost();
		//scanner.close();
	}

}
