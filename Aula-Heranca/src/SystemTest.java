public class SystemTest {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(1234);

        Customer customer = new Customer();
        customer.setPassword(123);

        InternSystem internSystem = new InternSystem();
        internSystem.check(manager);
        internSystem.check(customer);


    }
}
