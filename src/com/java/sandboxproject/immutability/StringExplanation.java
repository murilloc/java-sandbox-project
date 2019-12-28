package com.java.sandboxproject.immutability;

public class StringExplanation {
    public static void main(String[] args) {

        String name = new String("Murillo");
        name = new String("Cesar");

        String emptyName = new String();

        System.out.println("Name: " + name.toLowerCase());
        System.out.println("Name: " + name);
        System.out.println("Empty name: " + emptyName);



    }
}
