/**
 * Abstrakte Basisklasse für Wasserfahrzeuge
 */
abstract class Wasserfahrzeug {
    String name;
    int maxGeschwindigkeit;

    public Wasserfahrzeug(String name, int maxGeschwindigkeit) {
        this.name = name;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public abstract void beschleunigen();

    @Override
    public String toString() {
        return name + " (Max. Geschwindigkeit: " + maxGeschwindigkeit + " km/h)";
    }
}

