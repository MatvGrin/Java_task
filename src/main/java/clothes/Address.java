package clothes;

public class Address {
    //Створити класс Address: city code, city name, street, street number.
    //Визначити конструкори, геттери, сеттери, toString.

    private int cityCode;
    private String cityName;
    private String street;
    private int streetNumber;

    public Address(int cityCode, String cityName, String street, int streetNumber) {
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityCode=" + cityCode +
                ", cityName='" + cityName + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
