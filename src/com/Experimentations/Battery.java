package com.Experimentations;

public class Battery {
    private int capacity, temprature;
    private boolean ischarging;
    private float voltage, charge;

    public Battery(int capacity) {
        this.capacity = capacity;
        ischarging = false;
        temprature = 25;
        voltage = 350.00F;
        charge = 100.0F;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    public boolean isIscharging() {
        return ischarging;
    }

    public void setIscharging(boolean ischarging) {
        this.ischarging = ischarging;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public int getRange(ElectricCar electricCar){
        return (int) (capacity / electricCar.getMotorLoad()) * electricCar.getCurrentSpeed();
    }
}
