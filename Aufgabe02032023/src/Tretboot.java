/**
 * Tretboot
 */
class Tretboot extends ManuellBetriebenesWasserfahrzeug {
    int anzahlPedale;

    public Tretboot(String name, int maxGeschwindigkeit, int anzahlSitze, int anzahlPedale) {
        super(name, maxGeschwindigkeit, anzahlSitze);
        this.anzahlPedale = anzahlPedale;
    }

    @Override
    public String toString() {
        return super.toString() + ", Anzahl Sitze: " + anzahlSitze + ", Anzahl Pedale: " + anzahlPedale;
    }
}

