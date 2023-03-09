/**
 * Basisklasse für Ruder- und Tretboote
 */
class ManuellBetriebenesWasserfahrzeug extends Wasserfahrzeug {
    int anzahlSitze;

    /**
     * Constructor for ManuellBetriebenesWasserfahrzeug class
     * @param name name of the vehicle
     * @param maxGeschwindigkeit maximum speed of the vehicle
     * @param anzahlSitze number of seats on the vehicle
     */
    public ManuellBetriebenesWasserfahrzeug(String name, int maxGeschwindigkeit, int anzahlSitze) {
        super(name, maxGeschwindigkeit);
        this.anzahlSitze = anzahlSitze;
    }

    @Override
    public void beschleunigen() {
        System.out.println(name + " wird durch Muskelkraft angetrieben");
    }

    @Override
    public void zusatzgewicht() {
        System.out.println(name + " wird durch Muskelkraft angetrieben");
    }

}