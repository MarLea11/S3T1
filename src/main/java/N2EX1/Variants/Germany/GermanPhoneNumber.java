package N2EX1.Variants.Germany;

import N2EX1.Interfaces.PhoneNumber;

public class GermanPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public GermanPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryPhoneNumber() {
        return "+49 " + phoneNumber;
    }

}
