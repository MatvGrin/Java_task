package customers;

public class Customer implements Comparable<Customer> {
    //Створити класс Customer: id, name, surname, address (адреса),
    // credit card number(номер кредитної картимарка), account number (номер банківського рахунку).

    private long id;
    private String name;
    private String surname;
    private Address address;
    private int creditCardNumber;
    private int accountNumber;

    public Customer(long id, String name, String surname, Address address, int creditCardNumber, int accountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.accountNumber = accountNumber;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", accountNumber=" + accountNumber +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.surname.compareToIgnoreCase(o.surname);
    }
}
