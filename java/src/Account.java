public class Account {
    public String owner;
    public double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0.");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0.");
        } else if (amount > balance) {
            System.out.println("Uttag stoppat. För stort belopp.");
        } else {
            balance = balance - amount;
        }
    }
}
