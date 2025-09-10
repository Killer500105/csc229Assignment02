package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */

public abstract class Person {

    private String name;     // Stores the person's name
    private String address;  // Stores the person's address (to be defined by subclasses)
    private short age;       // Stores the person's age

    /**
     * Constructor for Person that initializes the name and age.
     * The address is not included since it will be handled by subclasses.
     *
     * @param name the person's name
     * @param age the person's age
     */
    public Person(String name, short age) {
        super();
        this.name = name;
        this.age = age;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method: subclasses must provide how to return the address
    public abstract String getAddress();

    // Abstract method: subclasses must provide how to set the address
    public abstract void setAddress(String address);

    // Getter for the age
    public short getAge() {
        return age;
    }

    // Setter for the age
    public void setAge(short age) {
        this.age = age;
    }
}
