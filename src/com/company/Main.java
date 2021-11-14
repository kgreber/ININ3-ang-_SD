package com.company;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.ConnectIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        try {
            String sourcePath = "c:/desktop/plik_który_nie_istnieje.txt";
            String destinationPath = "c:/desktop/folder_który_nie_istnieje/";
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath));
        } catch (FileSystemException e) {
            System.out.println("błąd dysku");
        } catch (ConnectIOException e) {
            System.out.println("błąd połączenia");
        } catch (IOException e) {
            System.out.println("inny błąd zapisu");
        } catch (Exception e) {
            System.out.println("jakiś inny błąd, nie mam pojęcia jaki");
        }


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

        int[] numbers = new int[4];

        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 1;
        numbers[3] = 2;

        System.out.println("sorted");
        for (int i : numbers) {
            System.out.println(i);
        }

        Arrays.sort(numbers);
        System.out.println("sorted");
        for (int i : numbers) {
            System.out.println(i);
        }

        String[] texts = new String[5];
        texts[0] = "234244";
        texts[1] = "afeafe";
        texts[2] = "agegeeer";
        texts[3] = "zzzzz";
        texts[4] = "gggg";

        Arrays.sort(texts);

        for (String s : texts) {
            System.out.println(s);
        }

        Car[] cars = new Car[5];
        cars [0] = new Bus("solaris", "S400", 2014);
        cars [1] = new Truck ("MAN", "milenial", 2021);
        cars [2] = null;
        cars [3] = new FunnyCar("Gokard", "gokart", 2000);
        cars [4] = new FunnyCar("Fiat", "500", 2005);

        Arrays.sort(cars, new CarComparator());

        for(Car car : cars){
            if (car == null){
                System.out.println("null");
            } else {
                System.out.println("producer " + car.producer + "model "+ car.model);
            }
        }
        LinkedList<Truck> trucks = new LinkedList<>();
        trucks.add(new Truck("SCANIA" , "S300", 2021));
        trucks.getLast().capacityInTones = 24.0;
        trucks.add(new Truck ("MERCEDES", "M200" , 2011));
        trucks.getLast().capacityInTones = 23.0;
        trucks.add(new Truck( "START", "200" , 2020));
        trucks.getLast().capacityInTones = 13.0;

        Collections.sort(trucks);

        System.out.println("trucks");
        for (Truck truck : trucks) {
            System.out.println(truck + "capacity" + truck.capacityInTones);
        }

        Collections.sort(trucks,Comparator.nullsFirst(Comparator.comparing(Truck::getCapacityInTones)));

        trucks.sort((Comparator.nullsFirst(Comparator.comparing(Truck :: getCapacityInTones))));
    }
}
