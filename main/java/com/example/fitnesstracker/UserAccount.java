package com.example.fitnesstracker;

import java.io.FileOutputStream;

public class UserAccount {

    private String fullName;
    private int dob;
    private int weight;
    private int height;

    public UserAccount(String fullName, int dob, int weight, int height) {

        setFullName(fullName);
        setDob(dob);
        setWeight(weight);
        setHeight(height);

    }

    public void getAccount() {

        System.out.println("UserAccount has the following information: ");
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + getDob());
        System.out.println("Weight: " + getWeight());
        System.out.println("Height: " + getHeight());

    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isEmpty())
            this.fullName = fullName;
        else
            this.fullName = "User";
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        if (dob > 0)
            this.dob = dob;
        else
            this.dob = -999;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
        else
            this.weight = -999;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            this.height = -999;
    }
}
