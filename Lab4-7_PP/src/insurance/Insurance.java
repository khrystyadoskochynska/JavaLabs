package insurance;

import java.util.Scanner;
import java.util.logging.Logger;

import commands.AddContract;
import commands.FindContract;
import contracts.AllContracts;
import contracts.Contract;

public class Insurance {
	
	private static Logger log = Logger.getLogger(Insurance.class.getName());
	
	private static void printMenu() {
		log.info("Print menu");
		System.out.println("1) Create new contract;");
		System.out.println("2) Searching information about the contract by contract ID;");
		System.out.println("3) Output all contracts;");
		System.out.println("4) Exit from the program;");
	}

	public static void start() {

		MenuCommandExecute menu = new MenuCommandExecute();
		AllContracts allContracts = new AllContracts();
		Scanner scanner = new Scanner(System.in);
		//String s = scanner.nextLine();
		//System.out.println(s);
		
			int key;
			do {
				
				System.out.println("Select the option from menu: \n");
				
				printMenu();
				key = scanner.nextInt();
				
				switch (key) {
				
				case 1:
					log.info("Adding new contract");
					System.out.println("Creating new contract \n");
					Contract contract = new Contract();
					
					
					AddContract addContract = new AddContract(contract);
					menu.executeCommand(addContract);
					System.out.println(contract.toString());
					//contract.getClientName();
					allContracts.AddContractToList(contract);
					String logAddedContract = "New contract added: ";
					logAddedContract += contract.toString();
					log.info(logAddedContract);
					break;
			
				case 2:
					System.out.println("To find contract type insuranse ID: \n");
					int findContractByID = scanner.nextInt();
					
					FindContract findContract = new FindContract(allContracts,findContractByID);	
					menu.executeCommand(findContract);
					
					break;
				case 3:
					System.out.println("List of all contracts: ");
					allContracts.printAllContracts();
					return ;
			
				case 4:
					System.out.println("Ending of the program");
					return ;
			
				default:
					System.out.println("Your chosen option isn't correct. Try again. \n");
					log.info("Incorrect selection from menu");
				}
			} while (key != 4);
		
		scanner.close();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("Start application");
		//printMenu();
		start();

	}

}
