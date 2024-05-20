package exercises.ex01.entities;

public class Bank {
    private int accountNumber;
    private String name;
    private double initialValue;

    public Bank() {};

    public Bank(int accountNumber, String name, double initialValue) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialValue);
    }

    public Bank(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialValue() {
        return initialValue;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double depositValue) {
        initialValue += depositValue;
    }

    public void withdraw (double withdrawValue) {
        initialValue -= withdrawValue + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + initialValue;
    }
}

