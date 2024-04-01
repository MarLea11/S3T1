package N2EX1.Variants.Italy;

import N2EX1.Interfaces.PhoneNumber;

public class ItalianPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public ItalianPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryPhoneNumber() {
        return "+39 " + phoneNumber;
    }

}
