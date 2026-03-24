package com.gla.exceptionHandling;
import java.util.*;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        // Check for negative amount
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // Check for insufficient balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Perform withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000); // Initial balance

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");

        } finally {
            sc.close();
        }
    }
}

