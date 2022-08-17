import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<String>();
        animals.addLast("Cat");
        animals.addLast("Dog");
        animals.addLast("Mouse");
        animals.addLast("Wolf");

        animals.addFirst("Beaver");

        animals.add(3, "Frog");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        System.out.println();

        LinkedList<String> planets = new LinkedList<String>();
        planets.addLast("Sun");
        planets.addLast("Mercury");
        planets.addLast("Venus");
        planets.addLast("Earth");
        planets.addLast("Moon");
        planets.addLast("Mars");
        planets.addLast("Jupiter");
        planets.addLast("Saturn");
        planets.addLast("Uranus");
        planets.addLast("Neptune");
        planets.addLast("Pluto");

        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }

        System.out.println();

        planets.removeFirst();

        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }

        System.out.println();

        planets.remove(3);

        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }

        System.out.println();

        planets.removeLast();

        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }

        System.out.println();

        planets.addLast("Pluto");

        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }
    }
}