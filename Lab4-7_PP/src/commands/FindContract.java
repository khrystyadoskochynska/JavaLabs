package commands;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import contracts.AllContracts;
import contracts.Contract;

public class FindContract implements Command {

	private AllContracts allContracts;
	private int findByID;

	public FindContract(AllContracts allContracts, int ID) {
		this.allContracts = allContracts;
		this.findByID = ID;
	}

	@Override
	public void execute() {
		List<Contract> listAllContracts = new ArrayList<>(allContracts.getAllContracts());

		ListIterator<Contract> iterator = listAllContracts.listIterator();
		boolean found = false;
		
		while (iterator.hasNext()) {
			// System.out.println(iterator.next().getID());
			Contract currContract = iterator.next();

			if (findByID == currContract.getID()) {
				System.out.println(currContract.toString());
				found = true;
			}
		}
		
		if (found == false) {
			System.out.println("Contract with ID " + findByID + " hasn't been found");
		}
	}
}
