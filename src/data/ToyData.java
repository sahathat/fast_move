package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[1];
        // your code
        bikes[0] = new Bike("Jone",12);
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[1];
        // your code
        person[0] = new Person("Journey","Map");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[1];
        // your code
        parcels[0] = new Parcel(5,ParcelStatus.READY_TO_SHIP,new Location(2,1));
        //parcels[1] = new Parcel(1,ParcelStatus.DELIVERED,new Location(8,9));
        //parcels[2] = new Parcel(15,ParcelStatus.SHIPPING,new Location(10,-5));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
