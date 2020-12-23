package insurance;

import commands.Command;

public class MenuCommandExecute {

	public MenuCommandExecute() {
		
	}
	
	public void executeCommand (Command command) {
		command.execute();
	}

}
