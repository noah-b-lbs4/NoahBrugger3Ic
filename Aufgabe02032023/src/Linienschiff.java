/**
 * Linienschiff
 */
class Linienschiff extends MotorisiertesWasserfahrzeug {
    int anzahlPassagiere;

    public Linienschiff(String name, int maxGeschwindigkeit, int leistung, int anzahlPassagiere ,int maxCargo) {
        super(name, maxGeschwindigkeit, leistung, maxCargo);
        this.anzahlPassagiere = anzahlPassagiere;
    }

    @Override
    public String toString() {
        return super.toString() + ", Leistung: " + leistung +", Anzahl Passagiere: " + anzahlPassagiere;
    }
}
