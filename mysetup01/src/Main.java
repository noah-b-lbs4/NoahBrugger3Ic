import java.util.ArrayList;

// Basisklasse
class Person {
    String name;
    int geburtsjahr;

    public Person(String name, int geburtsjahr) {
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    public int getAlter() {
        return java.time.Year.now().getValue() - geburtsjahr;
    }

    public String getKategorie() {
        if (getAlter() >= 18) {
            return "Erwachsener";
        } else {
            return "Kind";
        }
    }
}

// Abgeleitete Klasse
class Familie extends ArrayList<Person> {
    public void addPerson(Person person) {
        add(person);
    }

    public void ausgeben() {
        for (Person person : this) {
            System.out.println(person.name + ": " + person.getKategorie());
        }
    }
}

// Hauptklasse
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Max", 1995);
        Person person2 = new Person("Lisa", 2012);
        Person person3 = new Person("Peter", 1978);

        Familie familie = new Familie();
        familie.addPerson(person1);
        familie.addPerson(person2);
        familie.addPerson(person3);

        familie.ausgeben();
    }
}
