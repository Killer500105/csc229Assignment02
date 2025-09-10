package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */

/**
 *
 * Student class extends Person and adds GPA field.
 */
public class Student extends Person {
    private double gpa; // GPA field

    // Constructor
    public Student(String name, int age) {
        // Person constructor takes (String, short)
        super(name, (short) age);
    }

    // Getter and setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Override toString for nice print output
    @Override
    public String toString() {
        return "Student{name=" + getName() + ", age=" + getAge() + ", GPA=" + gpa + "}";
    }

    // Implement abstract methods from Person
    @Override
    public String getAddress() {
        return "Address not set"; // Stub
    }

    @Override
    public void setAddress(String address) {
        // In a real program, you would store this in a field
    }
}
