package com.sparta.nathan.spartans;

public class SpartanTrainee extends Spartans {

    public SpartanTrainee(String spartanName, String spartanAddress, int spartanContactNumber) {
        super(spartanName, spartanAddress, spartanContactNumber);
    }

    public void getSpartanTraineeStatus(){
        //SpartanTrainee and SpartanOnSite can use these generic variables
        System.out.println("Spartan Name:: " + getSpartanName());
        System.out.println("Spartan Address:: " + getSpartanAddress());
        System.out.println("Spartan Contact:: " + getSpartanContactNumber());
        System.out.println("While waiting assignment they would be in pre-assignment period/training");
    }

}
