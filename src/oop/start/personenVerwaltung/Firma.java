package oop.start.personenVerwaltung;

import java.util.Scanner;

public class Firma {
    public static void  main (String[] agrs) {
        Scanner sc = new Scanner(System.in);
        Personen Person1 = new Personen("Alex", "Baum", 3446.76);

        System.out.println(Person1.getNachName() + ", " + Person1.getVorName() + ", " + Person1.getGehalt());

        System.out.print("Neus Gehalt eingeben: ");
        Person1.setGehalt(sc.nextDouble());

        System.out.println(Person1.getNachName() + ", " + Person1.getVorName() + ", " + Person1.getGehalt());

        /*
        Personen Person2 = new Personen("Fabian", "Her", 4566.99);
        System.out.println(Person2.getNachName() + ", " + Person2.getVorName() + ", " + Person2.getGehalt());

        Person2.setGehalt(5000.00);
        System.out.println("Neues Gehalt: " + Person2.getGehalt());
        */
    }
}
