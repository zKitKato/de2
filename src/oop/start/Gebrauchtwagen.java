package oop.start;

import oop.start.fahr.Auto;

public class Gebrauchtwagen {
    public static void main(String[] args) {
        Auto Auto1 = new Auto(8999.99, "VW Golf", 2007, 56845, "blau");

        System.out.println(Auto1.getPrice());
        System.out.println(Auto1.getModell());
        System.out.println(Auto1.getYearOfConst());
        System.out.println(Auto1.getMileageStatus());
        System.out.println(Auto1.getColor());

        Auto1.setPrice(8799.99);
        System.out.print("Der neue Preis beträgt: " + Auto1.getPrice());

    }

}
