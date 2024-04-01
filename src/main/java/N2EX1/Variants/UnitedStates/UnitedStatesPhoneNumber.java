package N2EX1.Variants.UnitedStates;

import N2EX1.Interfaces.PhoneNumber;

public class UnitedStatesPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public UnitedStatesPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryPhoneNumber() {
        return "+1 " + phoneNumber;
    }

}
