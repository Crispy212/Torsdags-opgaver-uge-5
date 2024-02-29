import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	
	private ArrayList<String> actions = new ArrayList <>();
	
	public GameMenu (ArrayList<String> actions){
		this.actions = actions;
	}
	
	public void displayMenu(){
	
	for(String input : actions){
	System.out.println(input);
	}
	}
	
	public void getActions (){
	  Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of the action you want to choose:");
        String input = scanner.nextLine(); 
        int choice = Integer.parseInt(input);
	
	if (input.matches("\\d")){
		if(choice == 1){
		System.out.println("You have chosen: " + actions.get(0));
		}
		else if (choice == 2){
			System.out.println("You have chosen: " + actions.get(1));
		}
		else if (choice == 3){
			System.out.println("You have chosen: " + actions.get(2));
		}
		else if (choice == 4){
			System.out.println("You have chosen: " + actions.get(3));
		}
		else if (choice > 4){
			System.out.println("You have chosen and error. (1-4)");
			getActions();
		}
		}
		
		else{
			System.out.println("You have chosen and error. (1-4)");
			getActions();
		}
		
	}
	
	
}
	


