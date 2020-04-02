package com.Experimentations;

import java.text.NumberFormat;
import java.util.Date;

public class Automobile {
    private  boolean isOn = false,isIdling = false;;
    private  boolean isParkingLightsOn = false, isRightIndicatorOn = false, isLeftIndicatorOn = false, isHazardOn = false;
    private  boolean isHeadLampsOn = false, isAcOn = false, isEngineWarm = false;
    private  byte totalGears, currentGear, seatingCapacity, totalPassengers;
    private  int currentSpeed, odometerReading, year;
    private  String make, model;

    // Constructor
    public Automobile(String make,
                      String model,
                      int year,
                      int odometerReading,
                      int totalGears,
                      int seatingCapacity){

        this.make = make;
        this.model = model;
        this.year = year;
        this.odometerReading = odometerReading;
        this.totalGears = (byte)totalGears;
        this.seatingCapacity = (byte)seatingCapacity;

    }


    public void ignition() {
        this.isOn = true;
        this.isIdling = true;
    }

    public void engineOff() {
        this.isOn = false;
        this.isIdling = false;
    }

    public void headLampOn() {
        this.isHeadLampsOn = true;
    }

    public void headlampOff() {
        this.isHeadLampsOn = false;
    }

    public void toggleParkingLights() {
        this.isParkingLightsOn = !(this.isParkingLightsOn);
    }

    public boolean getParkingLights() {
        return this.isParkingLightsOn;
    }


    public void leftIndicatorOn() {
        this.isLeftIndicatorOn = true;
    }

    public void leftIndicatorOff() {
        this.isLeftIndicatorOn = false;
    }

}
