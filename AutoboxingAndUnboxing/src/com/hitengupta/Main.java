package com.hitengupta;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Hiten");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>(54);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for (int i=0;i<=10;i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i=0;i<=10;i++) {
            System.out.println(intArrayList.get(i).intValue());
        }





//        intArrayList.add(3);
//        intArrayList.add(2);
//        intArrayList.add(1);
//        intArrayList.add(4);
//        intArrayList.add(5);
//
//
//
//        System.out.println(intArrayList.size());
    }
}
