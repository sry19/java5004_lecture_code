import java.util.Objects;

public class Address {
    private Integer streetNumber;
    private String streetName;
    private String cityName;
    private String stateAckronym;
    private Integer zipCode;
    private String country;

    public Address(Integer streetNumber, String streetName, String cityName, String stateAckronym, Integer zipCode, String country){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateAckronym = stateAckronym;
        this.zipCode = zipCode;
        this.country = country;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateAckronym() {
        return stateAckronym;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getStreetNumber(), address.getStreetNumber()) &&
            Objects.equals(getStreetName(), address.getStreetName()) &&
            Objects.equals(getCityName(), address.getCityName()) &&
            Objects.equals(getStateAckronym(), address.getStateAckronym()) &&
            Objects.equals(getZipCode(), address.getZipCode()) &&
            Objects.equals(getCountry(), address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreetNumber(), getStreetName(), getCityName(), getStateAckronym(), getZipCode(), getCountry());
    }
}
