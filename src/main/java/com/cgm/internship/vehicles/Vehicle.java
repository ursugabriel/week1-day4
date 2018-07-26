package com.cgm.internship.vehicles;

import java.util.Random;

public class Vehicle{
    protected String name;
    protected String color;
    protected int currentSpeed=0;
    protected boolean isEngineOn=false;
    protected int maximumSpeed;
    protected boolean canRun=true;
    protected double tankVol;
    protected double currentLevTank;


    public void turnOnEngine(){
        if(canRun==true){
            isEngineOn=true;
            System.out.println("Engine on!");
        }
        else {
            isEngineOn=false;
            System.out.println("Repair your vehicle!");
        }

    }

    public void repairVehicle(){
        if(canRun==true){
            System.out.println("Your vehicle is working fine for now!");
        }
        else {
            canRun=true;
            System.out.println("Vehicle fixed!");
        }
    }

    public void turnOffEngine(){
        isEngineOn=false;
        System.out.println("Engine off!");
    }

    public void increaseSpeed(){
        Random rand = new Random();
        if(isEngineOn==true){
            if(currentSpeed<=maximumSpeed){
                currentSpeed+=rand.nextInt(10);
                System.out.println("Now you have "+currentSpeed+"km/h!");
            }
            if(currentSpeed>=maximumSpeed){
                System.out.println("If you want to drive that fast, just buy a better car!");
            }
        }
        else {
            System.out.println("Start the engine first!");
        }


    }
    public void decreaseSpeed(){
        Random rand = new Random();
        if(currentSpeed>=60){
             currentSpeed-=rand.nextInt(15);
             System.out.println("Now you have "+currentSpeed+"km/h!");
        }

        if(currentSpeed<60) {
            currentSpeed -= rand.nextInt(5);
            System.out.println("Now you have "+currentSpeed+"km/h!");
            if(currentSpeed<5){
                currentSpeed=0;
                System.out.println("Now you have "+currentSpeed+"km/h!");
            }
        }


    }
    public void crashVehicle(){
        currentSpeed=0;
        isEngineOn=false;
        canRun=false;
        System.out.println("Vehicle crashed! Good Job!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean getEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public boolean getCanRun() {
        return canRun;
    }

    public void setCanRun(boolean canRun) {
        this.canRun = canRun;
    }

    public double getTankVol() {
        return tankVol;
    }

    public void setTankVol(double tankVol) {
        this.tankVol = tankVol;
    }

    public double getCurrentLevTank() {
        return currentLevTank;
    }

    public void setCurrentLevTank(double currentLevTank) {
        this.currentLevTank = currentLevTank;
    }
}

class Car extends Vehicle implements GasVehicle{

    @Override
    public void putGas() {
       if(currentLevTank<tankVol){
           currentLevTank+=20;
           System.out.println("Done putting gas! Now you have "+currentLevTank+"l!");
       }
       else if(currentLevTank>=tankVol){
           System.out.println("Tank is already full!");
        }
    }

}


class Plane extends Vehicle implements AirVehicle{
    private String airlineCompany;
    private int fuelCapacity;
    private int currentAltitude=0;
    private double highestAltitude = 12800;
    private double lowestAltitude = 0;
    private boolean isVehicleAboveAir=false;

    @Override
    public void gainAltitude() {
        Random rand = new Random();
        if(isEngineOn==true){
            if(currentAltitude>=highestAltitude){
                System.out.println("Don't fly that high! Your plane may crash!");
            }
            else {
                currentAltitude+=rand.nextInt(500);
                isVehicleAboveAir=true;
                System.out.println("Your are now "+currentAltitude+" m above the ground!");
            }
        }
        else {
            System.out.println("Start your engine first!");
        }
    }

    @Override
    public void decreaseAltitude() {
        Random rand = new Random();
        if(currentAltitude>=lowestAltitude+50){
            currentAltitude-=rand.nextInt(15);
            System.out.println("Your are now "+currentAltitude+" m above the ground!");
        }
        else if(currentAltitude>=lowestAltitude+10){
            currentAltitude-=rand.nextInt(5);
            if(currentAltitude<=3){
                isVehicleAboveAir=false;
                System.out.println("Your plane landed for your safe! Altitude was to low!");
            }
            else {
                System.out.println("Your are now "+currentAltitude+" m above the ground!");
            }

        }
    }

    @Override
    public void landVehicle() {
        if(isVehicleAboveAir==true){
            isVehicleAboveAir=false;
            currentSpeed=0;
            currentAltitude=0;
            System.out.println("Plane landed!");
        }
        else {
            System.out.println("Your plane is not flying!");
        }
    }

    @Override
    public void turnOffEngine() {
        if(isVehicleAboveAir==true){
            crashVehicle();
        }
        else {
            isEngineOn=false;
            System.out.println("Engine off!");
        }
    }

    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(int currentAltitude) {
        this.currentAltitude = currentAltitude;
    }

    public double getHighestAltitude() {
        return highestAltitude;
    }

    public void setHighestAltitude(double highestAltitude) {
        this.highestAltitude = highestAltitude;
    }

    public double getLowestAltitude() {
        return lowestAltitude;
    }

    public void setLowestAltitude(double lowestAltitude) {
        this.lowestAltitude = lowestAltitude;
    }

    public boolean getVehicleAboveAir() {
        return isVehicleAboveAir;
    }

    public void setVehicleAboveAir(boolean vehicleAboveAir) {
        isVehicleAboveAir = vehicleAboveAir;
    }
}

class Helicopter extends Vehicle implements AirVehicle{
    private int fuelCapacity;
    private String fuelType;
    private int currentAltitude=0;
    private double highestAltitude = 8800;
    private double lowestAltitude = 0;
    private boolean isVehicleAboveAir=false;

    @Override
    public void gainAltitude() {
        Random rand = new Random();
        if(isEngineOn==true){
            if(currentAltitude>=highestAltitude){
                System.out.println("Don't fly that high! Your helicopter may crash!");
            }
            else {
                currentAltitude+=rand.nextInt(500);
                isVehicleAboveAir=true;
                System.out.println("Your are now "+currentAltitude+" m above the ground!");
            }
        }
        else {
            System.out.println("Start your engine first!");
        }

    }

    @Override
    public void decreaseAltitude() {
        Random rand = new Random();
        if(currentAltitude>=lowestAltitude+50){
            currentAltitude-=rand.nextInt(15);
            System.out.println("Your are now "+currentAltitude+" m above the ground!");
        }
        else if(currentAltitude>=lowestAltitude+10){
            currentAltitude-=rand.nextInt(5);
            if(currentAltitude<=3){
                isVehicleAboveAir=false;
                System.out.println("Your helicopter landed for your safe! Altitude was to low!");
            }
            else {
                System.out.println("Your are now "+currentAltitude+" m above the ground!");
            }

        }
    }

    @Override
    public void landVehicle() {
        if(isVehicleAboveAir==true){
            isVehicleAboveAir=false;
            currentSpeed=0;
            currentAltitude=0;
            System.out.println("Helicopter landed!");
        }
        else {
            System.out.println("Your helicopter is not flying!");
        }
    }

    @Override
    public void turnOffEngine() {
        if(isVehicleAboveAir==true){
            crashVehicle();
        }
        else {
            isEngineOn=false;
            System.out.println("Engine off!");
        }
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(int currentAltitude) {
        this.currentAltitude = currentAltitude;
    }

    public double getHighestAltitude() {
        return highestAltitude;
    }

    public void setHighestAltitude(double highestAltitude) {
        this.highestAltitude = highestAltitude;
    }

    public double getLowestAltitude() {
        return lowestAltitude;
    }

    public void setLowestAltitude(double lowestAltitude) {
        this.lowestAltitude = lowestAltitude;
    }

    public boolean getVehicleAboveAir() {
        return isVehicleAboveAir;
    }

    public void setVehicleAboveAir(boolean vehicleAboveAir) {
        isVehicleAboveAir = vehicleAboveAir;
    }
}

class Motorcycle extends Vehicle implements  GasVehicle{
    private int noOfGears;
    private boolean hasAdditionalSeat;

    @Override
    public void putGas() {
        if(currentLevTank<tankVol){
            currentLevTank+=20;
        }
        if(currentLevTank>=tankVol){
            System.out.println("Tank is already full!");
        }
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public boolean getHasAdditionalSeat() {
        return hasAdditionalSeat;
    }

    public void setHasAdditionalSeat(boolean hasAdditionalSeat) {
        this.hasAdditionalSeat = hasAdditionalSeat;
    }
}

interface AirVehicle {
     void gainAltitude();
     void decreaseAltitude();
     void landVehicle();

}

interface GasVehicle{
    void putGas();

}