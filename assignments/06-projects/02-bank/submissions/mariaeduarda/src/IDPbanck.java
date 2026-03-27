import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Account {

    private static int accountCounter = 1000; 
    private int id;
    private double balance;

    
    public Account() {
        accountCounter++;
        this.id = accountCounter;
        this.balance = 0.0; 
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public String getFormattedBalance() {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return format.format(this.balance);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Erro: O saldo não pode ser negativo.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}