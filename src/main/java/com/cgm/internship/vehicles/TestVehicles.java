package com.cgm.internship.vehicles;

public class TestVehicles {
    public static void main(String[] args) {

        //tests for a car
        GasVehicle car=new Car();
        ((Car) car).setName("Supercar number 1");
        ((Car) car).setColor("Red");
        ((Car) car).setCanRun(true);
        ((Car) car).setCurrentLevTank(20);
        ((Car) car).setCurrentSpeed(0);
        ((Car) car).setEngineOn(false);
        ((Car) car).setMaximumSpeed(310);
        ((Car) car).setTankVol(40);
        ((Car) car).turnOnEngine();
        ((Car) car).turnOffEngine();
        ((Car) car).crashVehicle();
        ((Car) car).turnOnEngine();
        ((Car) car).repairVehicle();
        car.putGas();
        car.putGas();
        ((Car) car).turnOnEngine();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).increaseSpeed();
        ((Car) car).decreaseSpeed();
        ((Car) car).decreaseSpeed();
        ((Car) car).decreaseSpeed();
        ((Car) car).decreaseSpeed();

        //tests for a plane
        System.out.println("===========================================");
        AirVehicle helicopter=new Helicopter();
        ((Helicopter) helicopter).setName("Helicopter number 1");
        ((Helicopter) helicopter).setColor("Red");
        ((Helicopter) helicopter).setCanRun(true);
        ((Helicopter) helicopter).setCurrentLevTank(20);
        ((Helicopter) helicopter).setCurrentSpeed(0);
        ((Helicopter) helicopter).setEngineOn(false);
        ((Helicopter) helicopter).setMaximumSpeed(310);
        ((Helicopter) helicopter).setTankVol(40);
        ((Helicopter) helicopter).gainAltitude();
        ((Helicopter) helicopter).turnOnEngine();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.gainAltitude();
        helicopter.decreaseAltitude();
        helicopter.decreaseAltitude();
        helicopter.decreaseAltitude();
        helicopter.decreaseAltitude();
        ((Helicopter) helicopter).turnOffEngine();


    }
}
