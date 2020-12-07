package com.sparta.nathan.spartans;

import java.util.Date;

public class SpartanOnSite extends Spartans{

    /*
        Variables specific to SpartanOnSite.
        Note there is no 'spartanType' because the Class
        itself is the 'spartanType'
     */
    private double pay;
    private String client;
    private Date contractEnd;

    /**
     * Class constructor pulls generic variables from
     * parent class 'Spartans'
     * @param spartanName           //
     * @param spartanAddress        //
     * @param spartanContactNumber  //
     */
    public SpartanOnSite(String spartanName, String spartanAddress, int spartanContactNumber) {
        super(spartanName, spartanAddress, spartanContactNumber);
    }

    public void getSpartanOnSiteStatus() {
        //SpartanTrainee and SpartanOnSite can use these generic variables
        System.out.println("Spartan Name:: " + getSpartanName());
        System.out.println("Spartan Address:: " + getSpartanAddress());
        System.out.println("Spartan Contact:: " + getSpartanContactNumber());

        //only SpartanOnSite has these class variables
        System.out.println("Spartan Pay:: " + getPay());
        System.out.println("Spartan Client:: " + getClient());
        System.out.println("Spartan Contract End:: " + getContractEnd());
    }

    /*
        Getters/Setters for specific SpartanOnSite variables
     */
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }
}
