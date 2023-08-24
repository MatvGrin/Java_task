package clothes;

public class CustomerDemo {
    public static void main(String[] args) {
        Address address1 = new Address(21000,"Split","Zala",12);
        Address address2 = new Address(25021,"Vinnitsa","Korolenko",35);
        Address address3 = new Address(95632,"Paris","Sandjmen",18);
        Address address4 = new Address(15328,"Amsterdam","Pikaso",26);

        Customer customer1 = new Customer(1,"Piter","Volker", address1, 4825,59);
        Customer customer2 = new Customer(2,"Lex","Alker", address2, 8965,98);
        Customer customer3 = new Customer(3,"Mark","Diper", address3, 2952,2);
        Customer customer4 = new Customer(4,"Luck","Menderi", address4, 3456,136);

        Customer[] customers = {customer1,customer2,customer3,customer4};

        CustomerService service = new CustomerService(customers);

        service.showAllCustomers();
        System.out.println("--------------------------------------");
        service.showCustomersByCity("Paris");
        System.out.println("--------------------------------------");
        service.showCustomersByCreditCard(3000, 6000);
        System.out.println("--------------------------------------");

        System.out.println(service.findCustomerById(3));
        System.out.println("--------------------------------------");
        System.out.println(service.findCustomerByAddress(address4));
        System.out.println("--------------------------------------");
        System.out.println(service.findCustomerByAccount(98));


    }
}
