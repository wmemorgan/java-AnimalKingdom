package animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    interface filterList {
        void run(CheckAnimal tester);
    }

    private static void runAnimalKingdom() {
        List<Animal> animals = new ArrayList<>();
        List<Animal> filteredList = new ArrayList<>();

        filterList filterAnimals = (CheckAnimal tester) -> {
            filteredList.clear();
            for (Animal a : animals) {
                if (tester.test(a)) {
                    filteredList.add(a);
                }
            }
        };

        // Instantiate Mammals
        System.out.println("Bring in the Mammals");
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal racoon = new Mammal("Racoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Add to list
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(racoon);
        animals.add(bigfoot);
        // System.out.println("Added mammals to the list: ");
        // System.out.println(animals);

        // Instantiate Birds
        System.out.println("Bring in the Birds");
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Add to list
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        // System.out.println("Added birds to the list: ");
        // System.out.println(animals);

        // Instantiate Fish
        System.out.println("Bring in the Fish");
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Add to list
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);
        // System.out.println("Added fish to the list: ");
        // System.out.println(animals);

        System.out.println("\n\n*** MVP ***\n");
        // ===== Sorting =====//
        // List animals in descending order by year named
        System.out.println("\n*** List all the animals in descending order by year named ***");
        animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println(animals);

        // List animals alphabetically
        System.out.println("\n*** List all the animals alphabetically ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animals);

        // List animals in descending order by year named
        System.out.println("\n*** List all the animals in order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animals);

        // Filtering
        System.out.println("\n*** List only animals that breath with lungs ***");
        filterAnimals.run(a -> a.breath().equals("lungs"));
        filteredList.forEach((a) -> System.out
                .println(a.name + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.year));

        System.out.println("\n*** List only animals that breath with lungs and were named in 1758 ***");
        filterAnimals.run(a -> (a.breath().equals("lungs")) && (a.getYear() == 1758));
        filteredList.forEach((a) -> System.out
                .println(a.name + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.year));

        System.out.println("\n*** List only animals that lay eggs and breath with lungs ***");
        filterAnimals.run(a -> (a.reproduce().equals("eggs")) && (a.breath().equals("lungs")));
        filteredList.forEach((a) -> System.out
                .println(a.name + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.year));

        System.out.println("\n*** List alphabetically animals that were named in 1758 ***");
        filterAnimals.run(a -> a.getYear() == 1758);
        filteredList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        filteredList.forEach((a) -> System.out
                .println(a.name + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.year));
    }

    public static void main(String[] args) {
        System.out.println("*** Welcome to Cafe Morgan's Animal Kingdom ***");
        runAnimalKingdom();
    }

}