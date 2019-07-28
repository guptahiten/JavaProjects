package com.company;

public class Main {


    public static void main(String[] args) {

        Bank bank = new Bank("SBI");

        if (bank.addBranch("Jaipur")) {
            System.out.println("Jaipur branch created");
        }

        bank.addCustomer("Jaipur", "Hiten", 50.05);
        bank.addCustomer("Jaipur", "Praveen", 175.34);
        bank.addCustomer("Jaipur", "Tim", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);


        bank.addCustomerTransaction("Jaipur", "Hiten", 44.22);
        bank.addCustomerTransaction("Jaipur", "Hiten", 12.44);
        bank.addCustomerTransaction("Jaipur", "Praveen", 1.65);

        bank.listCustomer("Jaipur", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exists.");
        }

        if (!bank.addBranch("Jaipur")){
            System.out.println("Jaipur branch already exists.");
        }

        if (!bank.addCustomerTransaction("Jaipur","Harendra",52.33)){
            System.out.println("Customer does not exists at branch");
        }

        if (!bank.addCustomer("Jaipur","Hiten",11.33)){
            System.out.println("Customer Hiten already exists.");
        }

    }
}
