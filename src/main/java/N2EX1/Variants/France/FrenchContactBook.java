package N2EX1.Variants.France;

import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.ContactBook;
import N2EX1.Interfaces.PhoneNumber;
import N2EX1.Variants.Spain.SpanishAddress;
import N2EX1.Variants.Spain.SpanishPhoneNumber;

public class FrenchContactBook implements ContactBook {

    public Address createAddress(String street, int streetNumber, String city, String postalCode) {
        return new FrenchAddress(street, streetNumber, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new FrenchPhoneNumber(phoneNumber);
    }
}
