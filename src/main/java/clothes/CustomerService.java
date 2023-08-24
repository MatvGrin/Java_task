package clothes;

import java.util.Arrays;
import java.util.Objects;

public class CustomerService {
    private Customer[] customers;


    public CustomerService(Customer[] customers) {
        this.customers = customers;
    }

    public void showAllCustomers() {  // по алфавіту виповнити!!
        Arrays.sort(customers);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void showCustomersByCity(String city) {
        for (Customer customer : customers) {
            if (Objects.equals(customer.getAddress().getCityName(), city)) {
                System.out.println(customer);
            }
        }
    }

    public void showCustomersByCreditCard(int start, int finish) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= start && customer.getCreditCardNumber() <= finish) {
                System.out.println(customer);
            }
        }
    }

    public Customer findCustomerById(long id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public Customer findCustomerByAddress(Address address) {
        for (Customer customer : customers) {
            if (Objects.equals(customer.getAddress(), address)) {
                return customer;
            }
        }
        return null;
    }

    public Customer findCustomerByAccount(int accNumber) {
        for (Customer customer : customers) {
            if (customer.getAccountNumber() == accNumber) {
                return customer;
            }
        }
        return null;
    }


}
