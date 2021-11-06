package com.company;

public class CarWash {
    void washTheCar(Car dirtyCar) {
        System.out.println("wait a sec");
        System.out.println("or two");
        System.out.println(dirtyCar.model + " is dirty");
        System.out.println(dirtyCar.model + " is dirty");
        System.out.println(dirtyCar.model + " is dirty");
        System.out.println(dirtyCar.model + " is clear now");
        System.out.println("now you have to pay "+ dirtyCar.getCleaningPrice());
    }
}
