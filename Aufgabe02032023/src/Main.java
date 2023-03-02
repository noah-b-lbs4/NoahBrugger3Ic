/**
 * @author Noah Brugger 3Ic
 * @version 0.1
 */

/**
 * Hauptklasse
 */
public class Main {
    public static void main(String[] args) {
        Wasserfahrzeug[] wasserfahrzeuge = new Wasserfahrzeug[4];
        wasserfahrzeuge[0] = new Ruderboot("Albatros", 10, 4, 2);
        wasserfahrzeuge[1] = new Tretboot("Pelikan", 8, 4, 4);
        wasserfahrzeuge[2] = new Linienschiff("Queen Mary", 50, 5000, 300);
        wasserfahrzeuge[3] = new MiniUboot("Nautilus", 30, 200, 100);
    }
}