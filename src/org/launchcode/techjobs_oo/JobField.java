package org.launchcode.techjobs_oo;
import java.util.Objects;

public class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField (String aValue){
        this();
        this.value = aValue;
    }

    public boolean isBlank() {
        return false;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
