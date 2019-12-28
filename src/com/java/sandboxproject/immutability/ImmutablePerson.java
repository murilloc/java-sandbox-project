package com.java.sandboxproject.immutability;

/**
 * Make a class immutable by following these guidelines:
 * <p>
 * - ensure the class cannot be overridden - make the class final, or use static factories and keep constructors private
 * - make fields private and final
 * - force callers to construct an object completely in a single step, instead of using a no-argument constructor combined with subsequent calls to setXXX methods (that is, avoid the Java Beans convention)
 * - do not provide any methods which can change the state of the object in any way - not just setXXX methods, but any method which can change state
 * - if the class has any mutable object fields, then they must be defensively copied when they pass between the class and its caller
 * <p>
 * reference: http://www.javapractices.com/
 */

public final class ImmutablePerson {

    private final String name;
    private final Integer age;
    private final String gender;

    public ImmutablePerson(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public ImmutablePerson raiseAge(Integer newAge) {
        return new ImmutablePerson(this.name, newAge, this.gender);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
