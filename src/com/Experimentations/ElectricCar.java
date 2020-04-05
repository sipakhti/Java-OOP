package com.Experimentations;

class ElectricCar extends Automobile {
    private byte numberOfMotors;
    private int Hp;
    Battery battery;


    public ElectricCar(String make,
                       String model,
                       int year,
                       int odometerReading,
                       int totalGears,
                       int seatingCapacity,
                       int weight,
                       int batteryCap) {
        super(make, model, year, odometerReading, totalGears, seatingCapacity,weight);
        this.battery = new Battery(batteryCap);
    }

    public int getHp() {
        return Hp;
    }

    public double getMotorLoad(){
        double KE = (0.5 * this.getWeight() * Math.pow(this.getCurrentSpeed(), 2));
        // convert joules to KWh and adding inefficiency of the motor
        return (KE * 0.0002777778) * 0.90 * 100;
    }

    public int range(){
       return battery.getRange(this);
    }
}
