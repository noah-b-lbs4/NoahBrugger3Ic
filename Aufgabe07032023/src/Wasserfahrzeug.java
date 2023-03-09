/**
 *  Abstrakte Basisklasse für Wasserfahrzeuge
 */
abstract class Wasserfahrzeug {
    String name;
    int maxGeschwindigkeit;
    int maxPersonen;

    public Wasserfahrzeug(String name, int maxGeschwindigkeit) {
        this.name = name;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.maxPersonen = maxPersonen;
    }

    public abstract void beschleunigen();

    public abstract void zusatzgewicht();

    @Override
    public String toString() {
        return name + " (Max. Geschwindigkeit: " + maxGeschwindigkeit + " km/h)";
    }
}