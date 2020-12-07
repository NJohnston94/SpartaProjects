package com.sparta.nathan.spartans;

public abstract class Spartans {

    private String spartanName;
    private String spartanAddress;
    private int spartanContactNumber;
    //tag field

    public Spartans () {

    }

    public Spartans(String spartanName, String spartanAddress, int spartanContactNumber) {
        this.spartanName = spartanName;
        this.spartanAddress = spartanAddress;
        this.spartanContactNumber = spartanContactNumber;
    }

    public String getSpartanName() {
        return spartanName;
    }

    public String getSpartanAddress() {
        return spartanAddress;
    }

    public int getSpartanContactNumber() {
        return spartanContactNumber;
    }

}
