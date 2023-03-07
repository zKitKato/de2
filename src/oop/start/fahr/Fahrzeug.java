package oop.start.fahr;

public class Fahrzeug {
    private double price;
    private String modell;
    private int yearOfConst;
    private int mileageStatus;


    /**
     * Konstruktor benötigt folgende Werte:
     * Preis,
     * Modell,
     * Baujahr,
     * Kilometerstand
     * Farbe.
     */
    public Fahrzeug(double price, String modell, int year, int mileage) {
        this.price = price;
        this.modell = modell;
        this.yearOfConst = year;
        this.mileageStatus = mileage;
    }

    /**Gibt den Preis zurück*/
    public double getPrice() {
        return price;
    }
    /**Gibt das Modell zurück*/
    public String getModell() {
        return modell;
    }
    /**Gibt das Baujahr zurück*/
    public int getYearOfConst() {
        return yearOfConst;
    }
    /**Gibt den Kilometerstand zurück*/
    public int getMileageStatus() {
        return mileageStatus;
    }
    /**Ändert den Preis*/
    public void setPrice(double price) {
        this.price = price;
    }
}
