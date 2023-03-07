package oop.start.personenVerwaltung;

/**
 * Diese Klasse stellt Personen dar. Sie enthält den Vornamen, Nachnamen und das Gehalt.
 */
public class Personen {
    private String vorName;
    private String nachName;
    private double gehalt;
    /**
     * Konstruktor benötigt folgende Werte:
     * Vorname,
     * Nachname,
     * Gehalt.
     */
    public Personen (String vorName, String nachName, double gehalt) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.gehalt = gehalt;
    }

    /** Gibt den Vornamen zurück*/
    public String getVorName() { return vorName; }
    /** Gibt den Nachnamen zurück*/
    public String getNachName() { return nachName; }
    /** Gibt das Gehalt zurück*/
    public double getGehalt() { return gehalt; }
    /** Ändert das Gehalt*/
    public void setGehalt(double gehalt) { this.gehalt = gehalt; }
}
