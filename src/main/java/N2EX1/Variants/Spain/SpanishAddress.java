package N2EX1.Variants.Spain;

import N2EX1.Interfaces.Address;

public class SpanishAddress implements Address {

    private String street;
    private int streetNumber;
    private String city;
    private String postalCode;

    public SpanishAddress(String street, int streetNumber, String city, String postalCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCountryAddress() {
        return street + " " + streetNumber + " " + city + " " + postalCode + " Spain";
    }

}
