package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {

        this();

        aName = name;
        aEmployer = employer;
        aLocation = location;
        aPositionType = positionType;
        aCoreCompetency = coreCompetency;
    }

    public String toString(){

        String str;

        if(getName().equals("") && getEmployer().getValue().equals("") && getLocation().getValue().equals("") && getPositionType().getValue().equals("") && getCoreCompetency().getValue().equals("")){
            return "Oops! This job does not seem to exist.";
        }

        if(getName().equals("")){
            this.name = "Data not available";
        }
        if(getEmployer().getValue().equals("")){
            this.employer = new Employer("Data not available";)
        }
        if(getLocation().getValue().equals("")){
            this.location = new Location("Data not available");
        }
        if(getPositionType().getValue().equals("")){
            this.positionType = new PositionType("Data not available");
        }
        if(getCoreCompetency().getValue().equals("")){
            this.coreCompetency = new CoreCompetency("Data not available");
        }


        str = "\nID : " + getId() +
                "\nName : " + getName() +
                "\nEmployer : " + getEmployer() +
                "\nLocation : " + getLocation() +
                "\nPosition Type : " + getPositionType() +
                "\nCore Competency : " + getCoreCompetency();

        return str;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
}
