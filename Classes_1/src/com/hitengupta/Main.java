package com.hitengupta;

public class Main {

    public static void main(String[] args) {
        Account hitenAccount = new Account("44444",100,"Hiten Gupta","hiten@gmail.com","1234567890");
        System.out.println(hitenAccount.getBalance());
        System.out.println(hitenAccount.getCustomerName());

        System.out.println("***************");

        hitenAccount.withdrawal(100);

        System.out.println("***************");

        hitenAccount.deposit(50);
        hitenAccount.withdrawal(100);

        System.out.println("***************");

        hitenAccount.deposit(500);
        hitenAccount.withdrawal(150);

        System.out.println("***************");

        hitenAccount.deposit(10000);
        hitenAccount.withdrawal(10400);

        System.out.println("-----------------------------");

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());

        System.out.println("-----------------------------");

        VipPerson person2 = new VipPerson("Tim",15000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        System.out.println("-----------------------------");

        VipPerson person3 = new VipPerson("Praveen",50000.00,"praveen@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());

        System.out.println("-----------------------------");

    }
}
