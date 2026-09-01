
package account;

public class SavingsAccount extends Account {

    public SavingsAccount(String n, String name, double b) {
        super(n, name, b);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nSavings Account");
        super.displayDetails();
    }
}


