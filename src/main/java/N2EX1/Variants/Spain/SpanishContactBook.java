package N2EX1.Variants.Spain;

import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.ContactBook;
import N2EX1.Interfaces.PhoneNumber;

public class SpanishContactBook implements ContactBook {

    public Address createAddress(String street, int streetNumber, String city, String postalCode) {
        return new SpanishAddress(street, streetNumber, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new SpanishPhoneNumber(phoneNumber);
    }

}
