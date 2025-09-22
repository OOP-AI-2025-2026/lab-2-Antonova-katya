package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

        BankAccount() {
            this.name = "";
            this.balance = 0.0;
            this.transactionFee = 0.0;
        }

        void deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
            }
        }

        double getBalance() {
            return this.balance;
        }

        boolean withdraw(double amount) {
            if (amount <= 0) {
                return false;
            }
            double totalDeduction = amount + transactionFee;
            if (balance >= totalDeduction) {
                balance = balance - totalDeduction;
                return true;
            }
                return false;
        }

        boolean transfer(BankAccount receiver, double amount) {
            if (amount <= 0) return false;
            double totalDeduction = amount + transactionFee;
            if (balance >= totalDeduction) {
                balance = balance - totalDeduction;
                receiver.balance = receiver.balance + amount;
                return true;
            }
                return false;
        }

        void setTransactionFee(double fee) {
            if (fee >= 0) {
                transactionFee = fee;
            }
        }

    }