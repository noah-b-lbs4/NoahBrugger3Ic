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
        wasserfahrzeuge[0] = new Ruderboot("Rudy01", 10, 4, 2);
        wasserfahrzeuge[1] = new Tretboot("Tretor01", 8, 4, 4);
        wasserfahrzeuge[2] = new Linienschiff("Linus01", 50, 5000, 300, 2000);
        wasserfahrzeuge[3] = new MiniUboot("Minsub01", 30, 200, 100, 100);

        for (Wasserfahrzeug wf : wasserfahrzeuge) {
            System.out.println(wf.toString());
            wf.beschleunigen();
            System.out.println();
        }

    }
}