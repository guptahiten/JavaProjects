package com.hitengupta;

public class Main {

    public static void main(String[] args) {
        for(int i=2;i<9;i++) {
            System.out.println("Interest for 10000 at " + i + "% rate is = " + String.format("%.2f",calculateInterest(i)));
        }

        System.out.println("------------------------");

        for(int i=8;i>=2;i--) {
            System.out.println("Interest for 10000 at " + i + "% rate is = " + String.format("%.2f",calculateInterest(i)));
        }

        System.out.println("------------------------");

        for(int i=2048;i>=1;i/=2){
            System.out.println("Loop " + i);
        }

        System.out.println("------------------------");

        int count = 0;
        for(int i=1;i<=20;i++){
            if(isPrime(i)){
               // System.out.println("isPrime " + isPrime(i));
                cxount++;
                System.out.println(i + " is prime number");
                if(count==i){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            System.out.println("value is " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double i) {
        return (10000 * (i/100));
    }
}
