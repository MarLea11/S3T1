package N1EX1;

import java.util.Scanner;

public class App {

    private App(){}

    public static void runProgram() {

        Undo undo = Undo.getInstance();

        int userOption;

        do{
           userOption = askInt("Select an option: 1. Add command, 2. Remove command, 3. Show command history, 0. Exit");
            menu(undo, userOption);
        } while(true);

    }

    public static void menu(Undo undo, int userOption) {

        switch(userOption) {
            case 1:
                undo.addCommand(askString("Now write the command you want: "));
                System.out.println("The command has been added.");
                break;
            case 2:
                undo.removeCommand();
                System.out.println("The command has been removed.");
                break;
            case 3:
                System.out.println(undo.getCommandHistory());
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Insert a valid option.");
        }

    }

    public static int askInt(String message){

        Scanner input = new Scanner(System.in);

        System.out.println(message);

        int userOption = input.nextInt();

        return userOption;

    }

    public static String askString(String message) {

        Scanner input = new Scanner(System.in);

        System.out.println(message);

        String userCommand = input.nextLine();

        return userCommand;

    }



}
