package com.hitengupta;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 1;
	    switch(switchValue) {
            case 1:
                System.out.println("1 was found");
                break;
            case 2:
                System.out.println("2 was found");
                break;
            case 3: case 4: case 5:
                System.out.println("3 or 4 or 5 was found");
                System.out.println(switchValue + " was found");
                break;
            default:
                System.out.println("NOT sure");
                break;
        }

        char charValue = 'B';
	    switch(charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("C or D or E was found");
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Not sure about character");
                break;
        }

        String month = "JuNe";
	    switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure about month");
        }
    }
}
