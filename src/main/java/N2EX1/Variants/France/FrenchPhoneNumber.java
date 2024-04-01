package N2EX1.Variants.France;

import N2EX1.Interfaces.PhoneNumber;

public class FrenchPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public FrenchPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryPhoneNumber() {
        return "+33 " + phoneNumber;
    }

}
