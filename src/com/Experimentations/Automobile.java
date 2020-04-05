package com.Experimentations;

import java.awt.print.PrinterGraphics;
import java.lang.annotation.Inherited;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Objects;

public class Automobile {

    private  boolean isParkingLightsOn = false, isRightIndicatorOn = false, isLeftIndicatorOn = false, isHazardOn = false;
    private  boolean isHeadLampsOn = false, isAcOn = false;
    private  byte totalGears, currentGear, seatingCapacity;
    private  int currentSpeed, odometerReading, year, weight;
    private  String make, model;
    private String chassisNum, engineNum;

    // Constructor
    public Automobile(String make,
                      String model,
                      int year,
                      int odometerReading,
                      int totalGears,
                      int seatingCapacity,
                      int weight){

        this.make = make;
        this.model = model;
        this.year = year;
        this.odometerReading = odometerReading;
        this.totalGears = (byte)totalGears;
        this.seatingCapacity = (byte)seatingCapacity;
        this.weight = weight;

    }
    // Alternate Constructor
    public Automobile(String unparsed){
        fromString(unparsed);
    }

    private void fromString(String... string){
        String[] s = string[0].split("-");
        this.make = s[0];
        this.model = s[1];
        this.year = Integer.parseInt(s[2]);
        this.odometerReading = Integer.parseInt(s[3]);
        this.totalGears = Byte.parseByte(s[4]);
        this.seatingCapacity = Byte.parseByte(s[5]);
        this.weight =  Integer.parseInt(s[6]);
    }

    public int getWeight() {
        return weight;
    }

    public void toggleHeadLights() {
        isHeadLampsOn = !isHeadLampsOn;
    }

    public boolean isHeadLampsOn() {
        return isHeadLampsOn;
    }


    public void toggleParkingLights() {
        isParkingLightsOn = !(isParkingLightsOn);
    }

    public boolean getParkingLights() {
        return isParkingLightsOn;
    }


    public void toggleLeftIndicator() {
        isLeftIndicatorOn = !isLeftIndicatorOn;
    }

    public boolean isLeftIndicatorOn() {
        return isLeftIndicatorOn;
    }


    public void toggleRightIndicator() {
        isRightIndicatorOn = !isRightIndicatorOn;
    }

    public boolean isRightIndicatorOn() {
        return isRightIndicatorOn;
    }


    public void toggleHazard() {
        isHazardOn = !isHazardOn;
    }

    public boolean isHazardOn() {
        return isHazardOn;
    }


    public void toggleAC() {
        isAcOn = !isAcOn;
    }

    public boolean isAcOn() {
        return isAcOn;
    }


    public void setCurrentGear(byte currentGear) {
        this.currentGear = currentGear;
    }

    public byte getCurrentGear() {
        return currentGear;
    }


    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }


    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int reading) {
        if (reading < odometerReading)
            throw new IllegalArgumentException("Odometer cannot be dialed back!");
        this.odometerReading = reading;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "odometerReading=" + odometerReading +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return chassisNum.equals(that.chassisNum) &&
                engineNum.equals(that.engineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chassisNum, engineNum);
    }
}


