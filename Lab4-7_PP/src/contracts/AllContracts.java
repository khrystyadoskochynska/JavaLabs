package contracts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class AllContracts {
	
	private List<Contract> listAllContracts = new ArrayList<Contract>();

	public List<Contract> getAllContracts() {
		return listAllContracts;
	}

	public void setAllContracts(List<Contract> allContracts) {
		this.listAllContracts = allContracts;
	}

	public List<Contract> printAllContracts() {
		
		 ListIterator<Contract> iterator = listAllContracts.listIterator(); 
		   while (iterator.hasNext()) { 
		          //System.out.println("All risks : " + iterator.next()); 
		          
		          //allRisks += iterator.next().name() + ",";
			   System.out.println(iterator.next().toString());
		          
		      } 

		return listAllContracts;
	}

	public void AddContractToList(Contract contract) {
		this.listAllContracts.add(contract);
	}
	
	public void SearchContract (int ID) {
		
	}
}
