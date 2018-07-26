package com.cgm.internship.vehicles;

import java.util.Random;

public class Vehicle{
    protected String brand;
    protected String model;
    protected String color;
    protected int prodYear;
    protected int maximumPassangers;
    protected int currentSpeed=0;
    protected boolean isEngineOn=false;

    public double generateSpeed(){
        Random rand = new Random();
        currentSpeed=rand.nextInt(300);
        return currentSpeed;
    }

    public boolean turnOnEngine(){
        return this.isEngineOn=true;
    }

    public boolean turnOffEngine(){
        return this.isEngineOn=false;
    }

    public void increaseSpeed(){

    }
    public void decreaseSpeed(){

    }
    public void crashVehicle(){

    }

}

class Car extends Vehicle implements LandVehicle{




}


class Plane extends Vehicle implements AirVehicle{
    private String airlineCompany;
    private int fuelCapacity;
    private String fuelType;
    private int currentAltitude=0;

    @Override
    public void gainAltitude() {

    }

    @Override
    public void decreaseAltitude() {

    }

    @Override
    public void landVehicle() {

    }
}

class Helicopter extends Vehicle implements AirVehicle{
    private String airlineCompany;
    private int fuelCapacity;
    private String fuelType;
    private int currentAltitude=0;

    @Override
    public void gainAltitude() {

    }

    @Override
    public void decreaseAltitude() {

    }

    @Override
    public void landVehicle() {

    }
}

class Motorcycle extends Vehicle implements LandVehicle{


}

interface AirVehicle {
     double highestAltitude = 12800;
     double lowestAltitude = 0;

     public void gainAltitude();
     public void decreaseAltitude();
     public void landVehicle();

}

interface LandVehicle{


}

interface GasVehicle{
    double gasPricePerL =5.99;
    double putGas();

}