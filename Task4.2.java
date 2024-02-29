import java.util.ArrayList;

class Client {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("Start game");
        actions.add("Resume game");
        actions.add("Pause game");
        actions.add("End game");

         GameMenu gameMenu = new GameMenu(actions);
        
        gameMenu.displayMenu();
		gameMenu.getActions();
    }
}
