# Personal Account Management System

## Overview
This Java project implements a simple personal account management system. It allows users to create a personal account, deposit and withdraw funds, view transaction history, and check their account balance.

## Classes

### PersonalAccount
- Represents a bank account with features for deposit, withdrawal, transaction history, and balance information.

### Amount
- Represents a monetary value with an associated transaction type (e.g., DEPOSIT or WITHDRAW).

## How to Use
1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `Main.java` file.

## Usage
- Create a new `PersonalAccount` with an account number and holder's name.
- Use `addFunds(double amount)` to deposit funds.
- Use `deductFunds(double amount)` to withdraw funds.
- Use `displayTransactionHistory()` to view transaction history.
- Use `getAccountBalance()` to get the current account balance.

## Example

```java
public class Main {
    public static void main(String[] args) {
        PersonalAccount acc = new PersonalAccount(1, "+996 559 880 208");

        acc.addFunds(50);
        acc.addFunds(100);
        acc.addFunds(200);
        acc.addFunds(300);

        acc.displayTransactionHistory();

        acc.deductFunds(100);
        acc.deductFunds(500);

        System.out.println("Current Balance: " + acc.getAccountBalance());
    }
}
