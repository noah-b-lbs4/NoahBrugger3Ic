/**
 * Linienschiff
 */
class Linienschiff extends MotorisiertesWasserfahrzeug {
    int anzahlPassagiere;

    public Linienschiff(String name, int maxGeschwindigkeit, int leistung, int anzahlPassagiere, int maxCargo) {
        super(name, maxGeschwindigkeit, leistung, maxCargo);
        this.anzahlPassagiere = anzahlPassagiere;
    }

    @Override
    public void motorAn() {
        System.out.println("Linienschiff-Motor wird gestartet.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Leistung: " + leistung +", Anzahl Passagiere: " + anzahlPassagiere;
    }
}