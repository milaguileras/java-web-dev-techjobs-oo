package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{



    // Custom toString, equals, and hashCode methods:


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }
}
