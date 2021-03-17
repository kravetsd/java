package com.javams;

import java.sql.SQLOutput;

public class BankAccount{

    private int accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    BankAccount(){
        System.out.println("Initializing your bank account");
    }
    public int getAccNumber() {
        System.out.println("Ypur account number is "+this.accNumber);
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        System.out.println("Setting account number to "+accNumber);
        this.accNumber = accNumber;
    }

    public double getBalance() {
        System.out.println("Checking balance..: ");
        System.out.println("Remaining balance is "+this.balance);
        return balance;
    }

    public void setBalance(double balance) {
        System.out.println("Lets try to add some money into the account..."+balance+"$:");
        this.balance = balance;
    }

    public String getCustomerName() {
        System.out.println("Customer full name: "+this.customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        System.out.println("Setting customer name to "+customerName);
        this.customerName = customerName;
    }

    public String getEmail() {
        System.out.println("customer email is "+ this.email);
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Setting email to "+email);
        this.email = email;
    }

    public String getPhoneNumber() {
        System.out.println("customer phone number is "+ phoneNumber);
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        System.out.println("Setting phone number to "+phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    // Additional methods:
    public void depositFounds(double deposit){
        if (deposit<0){
            System.out.println("Invalid value to deposit");
            System.out.println("Remaining balance is "+ this.balance);
        } else {
            this.balance+=deposit;
            System.out.println("Adding "+deposit+"$ to your balance");
            System.out.println("Remaining balance is "+ this.balance+"$");
        }
    }
    public void withfrawFounds(double withdrawal){
        System.out.println("Lets try to get some money from your account..."+withdrawal+"$:");
        if (withdrawal<0){
            System.out.println("Invalid value");
            System.out.println("Remaining balance is "+ this.balance+"$");
        } else if (this.balance<withdrawal){
            System.out.println("You have no enough money for this operation");
            System.out.println("Remaining balance is "+ this.balance+"$");

        } else {
            this.balance-=withdrawal;
            System.out.println("Remaining balance is "+ this.balance+"$");
        }
    }

}
