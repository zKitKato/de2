package oop.start.fahr;

/**
 * Klasse für Motorräder
 */
public class Motorrad extends Fahrzeug{
    private int hubraum;
    /**
     * Konstruktor benötigt folgende Werte: Preis, Modell, Bau-
     * jahr, Kilometerstand und Hubraum.
     */
    public Motorrad (double wert1, String wert2, int wert3, int wert4, int wert5){
        super(wert1, wert2, wert3, wert4);
        this.hubraum = wert5;

    }

    /**
     * Gibt den Hubraum zurück
     */
    public int getHubraum() {
        return hubraum;
    }
}
