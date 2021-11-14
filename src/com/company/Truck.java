package com.company;

public class Truck extends Car {
    Double capacityInTones;
    Double actualCargoWeight;
    Double drivingTimeInHours;

    public Truck(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.capacityInTones = 24.0;
        this.actualCargoWeight = 0.0;
        this.drivingTimeInHours = 0.0;
    }

    public void loadTruck(Double cargoWeight) {
        if (actualCargoWeight + cargoWeight > capacityInTones) {
            System.out.println("SORRY OVERLOADED");
        } else {
            this.actualCargoWeight += cargoWeight;
            System.out.println("We loaded " + cargoWeight + " tones");
        }
    }

    public void unloadTruck() {
        this.actualCargoWeight = 0.0;
    }

    public void drive(Double distance) {
        if (drivingTimeInHours < 10.0) {
            this.millage += distance;
            this.drivingTimeInHours += distance / 80.0;
        } else {
            System.out.println("you need to rest");
        }
    }

    @Override
    public Double getCleaningPrice() {
        return 120.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("12 wheels changed");
    }

    void rest() {
        this.drivingTimeInHours = 0.0;
    }

    public int compareTO(Truck otherTruck) {
        if (this.capacityInTones > otherTruck.capacityInTones) {
            return -1;

        } else if (this.capacityInTones.equals(otherTruck.capacityInTones)) {
            return 0;
        } else {
            return 1;
        }
    }


    public Double getCapacityInTones() {
        return this.capacityInTones;
    }
}
