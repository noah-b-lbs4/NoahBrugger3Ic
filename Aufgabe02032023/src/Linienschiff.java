/**
 * Linienschiff
 */
class Linienschiff extends MotorisiertesWasserfahrzeug {
    int anzahlPassagiere;

    public Linienschiff(String name, int maxGeschwindigkeit, int leistung, int anzahlPassagiere) {
        super(name, maxGeschwindigkeit, leistung);
        this.anzahlPassagiere = anzahlPassagiere;
    }

    @Override
    public String toString() {
        return super.toString() + ", Leistung: " + leistung +", Anzahl Passagiere: " + anzahlPassagiere;
    }
}
