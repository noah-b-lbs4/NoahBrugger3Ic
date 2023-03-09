import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hauptklasse
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Wasserfahrzeug> fahrzeuge = new ArrayList<>();

        // Menüoptionen
        final int CREATE_VEHICLE = 1;
        final int CALL_METHOD = 2;
        final int USE_OBJECT = 3;
        final int DELETE_OBJECT = 4;
        final int SEARCH_OBJECT = 5;
        final int EXIT = 6;

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Wählen Sie eine Option:");
            System.out.println("1. Fahrzeug erstellen");
            System.out.println("2. Methode aufrufen");
            System.out.println("3. Fahrzeug verwenden");
            System.out.println("4. Fahrzeug löschen");
            System.out.println("5. Beenden");

            option = input.nextInt();

            switch(option) {
                case CREATE_VEHICLE:
                    System.out.println("Wählen Sie eine Fahrzeugart:");
                    System.out.println("1. Linienschiff");
                    System.out.println("2. Mini-Uboot");
                    System.out.println("3. Ruderboot");
                    System.out.println("4. Tretboot");

                    int vehicleType = input.nextInt();

                    switch (vehicleType) {
                        case 1:
                            System.out.println("Geben Sie den Namen des Linienschiffs ein:");
                            String name = input.next();
                            System.out.println("Geben Sie die maximale Geschwindigkeit des Linienschiffs ein:");
                            int maxSpeed = input.nextInt();
                            System.out.println("Geben Sie die Leistung des Linienschiffs ein:");
                            int power = input.nextInt();
                            System.out.println("Geben Sie die maximale Anzahl der Passagiere des Linienschiffs ein:");
                            int passengerCount = input.nextInt();
                            System.out.println("Geben Sie die maximale Frachtkapazität des Linienschiffs ein:");
                            int maxCargo = input.nextInt();

                            fahrzeuge.add(new Linienschiff(name, maxSpeed, power, passengerCount, maxCargo));
                            System.out.println("Linienschiff wurde erstellt.");
                            break;

                        case 2:
                            System.out.println("Geben Sie den Namen des Mini-Uboots ein:");
                            name = input.next();
                            System.out.println("Geben Sie die maximale Geschwindigkeit des Mini-Uboots ein:");
                            maxSpeed = input.nextInt();
                            System.out.println("Geben Sie die Leistung des Mini-Uboots ein:");
                            power = input.nextInt();
                            System.out.println("Geben Sie die maximale Tauchtiefe des Mini-Uboots ein:");
                            int divingDepth = input.nextInt();
                            System.out.println("Geben Sie die maximale Frachtkapazität des Mini-Uboots ein:");
                            maxCargo = input.nextInt();

                            fahrzeuge.add(new MiniUboot(name, maxSpeed, power, divingDepth, maxCargo));
                            System.out.println("Mini-Uboot wurde erstellt.");
                            break;

                        case 3:
                            System.out.println("Geben Sie den Namen des Ruderboots ein:");
                            name = input.next();
                            System.out.println("Geben Sie die maximale Geschwindigkeit des Ruderboots ein:");
                            maxSpeed = input.nextInt();
                            System.out.println("Geben Sie die maximale Anzahl der Sitze des Ruderboots ein:");
                            int seatCount = input.nextInt();
                            System.out.println("Geben Sie die Anzahl der Ruder des Ruderboots ein:");
                            int oarCount = input.nextInt();

                            fahrzeuge.add(new Ruderboot(name, maxSpeed, seatCount, oarCount));
                            System.out.println("Ruderboot wurde erstellt.");
                            break;

                        case 4:
                            System.out.println("Geben Sie den Namen des Tretboots ein:");
                            name = input.next();
                            System.out.println("Geben Sie die maximale Geschwindigkeit des Tretboots ein:");
                            maxSpeed = input.nextInt();
                            System.out.println("Geben Sie die maximale Anzahl der Sitze des Tretboots ein:");
                            seatCount = input.nextInt();
                            System.out.println("Geben Sie die Anzahl der Pedale des Tretboots ein:");
                            int pedalCount = input.nextInt();

                            fahrzeuge.add(new Tretboot(name, maxSpeed, seatCount, pedalCount));
                            System.out.println("Tretboot wurde erstellt.");
                            break;
                        default:
                            System.out.println("Ungültige Eingabe");
                            break;
                    }

                    break;

                case CALL_METHOD:
                    System.out.println("Geben Sie den Index des Objekts ein:");
                    int index = input.nextInt();
                    if (index < 0 || index >= fahrzeuge.size()) {
                        System.out.println("Ungültiger Index");
                        break;
                    }
                    System.out.println("1. Beschleunigen");
                    System.out.println("2. Zusatzgewicht");

                    int methodType = input.nextInt();

                    switch (methodType) {
                        case 1:
                            fahrzeuge.get(index).beschleunigen();
                            break;

                        case 2:
                            fahrzeuge.get(index).zusatzgewicht();
                            break;

                        default:
                            System.out.println("Ungültige Eingabe");
                            break;
                    }

                    break;

                case USE_OBJECT:
                    System.out.println("Geben Sie den Index des Objekts ein:");
                    index = input.nextInt();
                    if (index < 0 || index >= fahrzeuge.size()) {
                        System.out.println("Ungültiger Index");
                        break;
                    }

                    System.out.println("Objekt " + fahrzeuge.get(index).toString() + " wird verwendet.");

                    break;

                case DELETE_OBJECT:
                    System.out.println("Geben Sie den Index des Objekts ein:");
                    index = input.nextInt();
                    if (index < 0 || index >= fahrzeuge.size()) {
                        System.out.println("Ungültiger Index");
                        break;
                    }

                    fahrzeuge.remove(index);
                    System.out.println("Objekt wurde gelöscht.");

                    break;

                case SEARCH_OBJECT:
                    System.out.println("Geben Sie den Namen des gesuchten Objekts ein:");
                    String searchName = input.next();

                    for (int i = 0; i < fahrzeuge.size(); i++) {
                        if (fahrzeuge.get(i).equals(searchName)) {
                            System.out.println("Objekt gefunden an Index " + i + ": " + fahrzeuge.get(i).toString());
                            break;
                        }
                    }

                    System.out.println("Objekt nicht gefunden.");

                    break;

                case EXIT:
                    System.out.println("Das Programm wird beendet.");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
        } while (option != EXIT);
    }
}

