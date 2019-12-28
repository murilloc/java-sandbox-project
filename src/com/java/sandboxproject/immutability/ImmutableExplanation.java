package com.java.sandboxproject.immutability;




public class ImmutableExplanation {

    public static void main(String[] args) {

        ImmutablePerson person = new ImmutablePerson("Murillo", 53, "male");
        System.out.println(person);

        person.raiseAge(58); // Do not change the class state
        System.out.println(person);

        System.out.println(person.raiseAge(54));
        System.out.println(person);

        person = person.raiseAge(65);
        System.out.println(person);
    }
}
