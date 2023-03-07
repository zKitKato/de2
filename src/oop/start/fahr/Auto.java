package oop.start.fahr;
/**
 * Diese Klasse stellt einen Gebrauchtwagen dar. Sie enthält den
 * Preis, das Modell, das Baujahr, den Kilometerstand und die Farbe.
 */
public class Auto extends Fahrzeug{
    private String color;

    /**
     * Konstruktor benötigt folgende Werte:
     * Preis,
     * Modell,
     * Baujahr,
     * Kilometerstand
     * Farbe.
     */
    public Auto(double price, String modell, int year, int mileage, String color) {
        super(price, modell, year, mileage);
        this.color = color;
    }

    /**Gibt die Farbe zurück*/
    public String getColor() {
        return color;
    }
}
