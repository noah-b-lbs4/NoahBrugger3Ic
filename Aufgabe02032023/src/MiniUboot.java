/**
 *Mini-Uboot
 */
class MiniUboot extends MotorisiertesWasserfahrzeug {
    int tauchtiefe;

    public MiniUboot(String name, int maxGeschwindigkeit, int leistung, int tauchtiefe, int maxCargo) {
        super(name, maxGeschwindigkeit, leistung, maxCargo);
        this.tauchtiefe = tauchtiefe;
    }

    @Override
    public String toString() {
        return super.toString() + ", Leistung: " + leistung + ", Tauchtiefe: " + tauchtiefe + "m";
    }
}