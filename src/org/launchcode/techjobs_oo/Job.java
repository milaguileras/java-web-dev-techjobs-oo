package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job extends JobField{

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job( String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {

        this();

        this.name = aName ;
        this.employer = aEmployer ;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    @Override
    public String toString(){

        String str;

        if(getName().equals("")
                && getEmployer().getValue().equals("")
                && getLocation().getValue().equals("")
                && getPositionType().getValue().equals("")
                && getCoreCompetency().getValue().equals("")) {
            return "Oops! This job does not seem to exist.";
        }

        if(name.equals("")){
            this.name = "Data not available";
            System.out.println(name);
        }
        if(employer.getValue().equals("")){
            this.employer = new Employer("Data not available");
        }
        if(location.getValue().equals("")){
            this.location = new Location("Data not available");
        }
        if(positionType.getValue().equals("")){
            this.positionType = new PositionType("Data not available");
        }
        if(coreCompetency.getValue().equals("")){
            this.coreCompetency = new CoreCompetency("Data not available");
        }

        str = "\nID: " + getId() +
                "\nName: " + getName() +
                "\nEmployer: " + getEmployer() +
                "\nLocation: " + getLocation() +
                "\nPosition Type: " + getPositionType() +
                "\nCore Competency: " + getCoreCompetency() + "\n";

        return str;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
