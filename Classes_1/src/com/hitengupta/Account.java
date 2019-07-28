package com.hitengupta;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("98765",10,"Default Name","myaddress@email.com","9876543210");
        System.out.println("Empty Constructer called");
    }

    public Account(String number,double balance,String customerName, String customerEmailAddress,String customerPhoneNumber) {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance= balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("00000",1.00,customerName,customerEmailAddress,customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is  " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if((this.balance - withdrawalAmount) < 0){
            System.out.println("Process Declined. Current balance is " + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
