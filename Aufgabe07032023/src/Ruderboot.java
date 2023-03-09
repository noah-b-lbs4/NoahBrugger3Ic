/**
 * Ruderboot
 */
class Ruderboot extends ManuellBetriebenesWasserfahrzeug implements NichtMotorisiert {
    int anzahlRuder;

    public Ruderboot(String name, int maxGeschwindigkeit, int anzahlSitze, int anzahlRuder) {
        super(name, maxGeschwindigkeit, anzahlSitze);
        this.anzahlRuder = anzahlRuder;
    }

    @Override
    public void ruderEinholen() {
        System.out.println("Ruderboot-Ruder werden eingeholt.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Anzahl Sitze: " + anzahlSitze + ", Anzahl Ruder: " + anzahlRuder;
    }
}
