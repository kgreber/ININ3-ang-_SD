package com.company;

public class Main {

    public static void main(String[] args) {
        PersonalCar fiat = new PersonalCar("fiat", "bravo", 2016);
        PersonalCar bmw = new PersonalCar("bmw", "X5", 2020);
        PersonalCar vw = new PersonalCar("vw", "passat", 1990);

        Truck scania = new Truck("Scania", "S230", 2021);
        scania.capacityInTones = 24.2;


        Bus solaris = new Bus("Solaris", "V200", 2021);
        solaris.capacityInPeople = 40;
        scania.loadTruck(2.0);
        scania.loadTruck(2.0);
        scania.loadTruck(2.0);
        scania.unloadTruck();

        scania.drive(1000.0);
        scania.drive(10.0);
        System.out.println("Truck millage:" + scania.millage);

        vw.drive(1000.0);
        vw.drive(10.0);
        System.out.println("VW millage:" + vw.millage);

        System.out.println(vw);
        System.out.println(scania);
        System.out.println(solaris);
        System.out.println(solaris.toString());

        CarWash superClear = new CarWash();
        superClear.washTheCar(fiat);
        superClear.washTheCar(vw);
        superClear.washTheCar(scania);
        superClear.washTheCar(solaris);

        fiat.changeWheels();
        scania.changeWheels();
        solaris.changeWheels();
    }
}
