package N2EX1.Variants.Spain;

import N2EX1.Interfaces.PhoneNumber;

public class SpanishPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public SpanishPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryPhoneNumber() {
        return "+34 " + phoneNumber;
    }

}
