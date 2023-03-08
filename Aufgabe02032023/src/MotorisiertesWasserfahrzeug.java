/**
 * Basisklasse für motorisierte Wasserfahrzeuge
 */
class MotorisiertesWasserfahrzeug extends Wasserfahrzeug {
    int leistung;
    int maxCargo;

    public MotorisiertesWasserfahrzeug(String name, int maxGeschwindigkeit, int leistung, int maxCargo) {
        super(name, maxGeschwindigkeit);
        this.leistung = leistung;
        this.maxCargo = maxCargo;
    }

    @Override
    public void beschleunigen() {
        System.out.println(name + " beschleunigt auf " + maxGeschwindigkeit + " km/h");
    }

    @Override
    public void zusatzgewicht() {
        System.out.println(name + " beschleunigt auf " + maxGeschwindigkeit + " km/h");
    }
}
