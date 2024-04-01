package N1EX1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> commandHistory;

    private Undo(){
     commandHistory = new ArrayList<>();
    }

    public static synchronized Undo getInstance() {

        if(instance == null) {
            instance = new Undo();
        }

        return instance;
    }

    public void addCommand(String command) {
        commandHistory.add(command);
    }

    public void removeCommand() {

        if(!commandHistory.isEmpty()) {
            commandHistory.removeLast();
        }
    }

    public void listCommands() {
        System.out.println("Command history: ");

        for (int i = 0; i < commandHistory.size(); i++) {
            System.out.println((i+1) + ". " + commandHistory.get(i));
            i++;
        }
    }

    public List<String> getCommandHistory() {
        return commandHistory;
    }


}
