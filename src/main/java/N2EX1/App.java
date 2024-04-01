package N2EX1;

import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.ContactBook;
import N2EX1.Interfaces.PhoneNumber;
import N2EX1.Variants.France.FrenchContactBook;
import N2EX1.Variants.Germany.GermanContactBook;
import N2EX1.Variants.Italy.ItalianContactBook;
import N2EX1.Variants.Spain.SpanishContactBook;
import N2EX1.Variants.UnitedStates.UnitedStatesContactBook;

public class App {

    private App(){}

    public static void runProgram() {

        ContactBook frenchFactory = new FrenchContactBook();

        ContactBook germanFactory = new GermanContactBook();

        ContactBook italyFactory = new ItalianContactBook();

        ContactBook spainFactory = new SpanishContactBook();

        ContactBook unitedStatesFactory = new UnitedStatesContactBook();

        Address spanishAddress = spainFactory.createAddress("Street", 15, "Barcelona", "08035");
        System.out.println("Spanish Address: " + spanishAddress.getCountryAddress());
        PhoneNumber spanishPhoneNumber = spainFactory.createPhoneNumber("694754213");
        System.out.println("Spanish Phone Number: " + spanishPhoneNumber.getCountryPhoneNumber());
    }

}
