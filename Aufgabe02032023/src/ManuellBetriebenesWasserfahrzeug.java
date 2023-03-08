/**
 * Basisklasse für Ruder- und Tretboote
 */
class ManuellBetriebenesWasserfahrzeug extends Wasserfahrzeug {
    int anzahlSitze;

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
