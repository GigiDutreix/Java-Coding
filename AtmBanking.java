import java.lang.String;

public class AtmBanking {
public class Account {

    private static int count = 0;

    private String name;
    private String pin;
    private int id;
    private double balance;

    public Account(String name, String pin) {
        this.name = name;
        this.pin = pin;
        this.balance = 0.0;
        this.id = count;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean isPin(String attempt) {
        if (attempt == null) {
            return false;
        }
        return this.pin.equals(attempt);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public String toString() {
        return String.format("Name: %s, Account ID: %d, Balance: $%.02f",
                             this.name, this.id, this.balance);
    }

} }