/**
 * Basisklasse für motorisierte Wasserfahrzeuge
 */
class MotorisiertesWasserfahrzeug extends Wasserfahrzeug {
    int leistung;

    public MotorisiertesWasserfahrzeug(String name, int maxGeschwindigkeit, int leistung) {
        super(name, maxGeschwindigkeit);
        this.leistung = leistung;
    }

    @Override
    public void beschleunigen() {
        System.out.println(name + " beschleunigt auf " + maxGeschwindigkeit + " km/h");
    }
}
