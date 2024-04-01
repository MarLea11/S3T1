package N2EX1.Interfaces;

public interface ContactBook {
    Address createAddress(String street, int streetNumber, String city, String postalCode);
    PhoneNumber createPhoneNumber(String phoneNumber);
}
