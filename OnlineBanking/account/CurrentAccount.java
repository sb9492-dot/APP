
package account;

public class CurrentAccount extends Account {

    public CurrentAccount(String n, String name, double b) {
        super(n, name, b);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nCurrent Account");
        super.displayDetails();
    }
}


