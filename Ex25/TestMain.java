package Ex25;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Nguyen Van A", 'm');
        System.out.println(c1);
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());

        Account a1 = new Account(88, c1, 500.0);
        System.out.println(a1);

        a1.setBalance(1000.50);
        System.out.println("Account ID: " + a1.getId());
        System.out.println("Customer Name: " + a1.getCustomerName());
        System.out.println("New Balance: $" + a1.getBalance());

        a1.deposit(250.25);
        System.out.println("After deposit $250.25: " + a1);

        a1.withdraw(500.0);
        System.out.println("After withdraw $500.00: " + a1);

        System.out.print("Trying to withdraw $1000.00: ");
        a1.withdraw(1000.0);
        System.out.println("Status after invalid withdraw: " + a1);
    }
}
