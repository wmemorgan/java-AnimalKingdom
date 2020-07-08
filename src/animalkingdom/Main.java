package animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Animal> filteredList = new ArrayList<>();

    public static void filterAnimal(List<Animal> animals, CheckAnimal tester) {
        filteredList.clear();

        for (Animal a : animals) {
            if (tester.test(a)) {
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n*** Welcome to Cafe Morgan's Animal Kingdom ***\n");

        // Create Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal racoon = new Mammal("Racoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Create Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Create Fish
        Fish salmon = new Fish("Salmon", 1785);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Create animal list
        List<Animal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(racoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        // Sort list
        System.out.println("\n*** List all the animals in descending order by year named ***");
        animals.sort((a1, a2) -> a2.getyearNamed() - a1.getyearNamed());
        System.out.print(animals);
        System.out.println();

        System.out.println("\n*** List all the animals alphabetically ***");
        animals.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        System.out.print(animals);
        System.out.println();

        System.out.println("\n*** List all the animals order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareTo(a2.move()));
        System.out.print(animals);
        System.out.println();

        // Filter list
        System.out.println("\n*** List only those animals the breath with lungs ***");
        filterAnimal(animals, a -> a.breath().equals("lungs"));
        filteredList.forEach(a -> System.out.println(
                a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
        System.out.println();

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filterAnimal(animals, a -> (a.breath().equals("lungs")) && (a.getyearNamed() == 1758));
        filteredList.forEach(a -> System.out.println(
                a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
        System.out.println();

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filterAnimal(animals, a -> (a.breath().equals("lungs")) && (a.reproduce().equals("eggs")));
        filteredList.forEach(a -> System.out.println(
                a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
        System.out.println();

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        filterAnimal(animals, a -> a.getyearNamed() == 1758);
        filteredList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        filteredList.forEach(a -> System.out.println(
                a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
        System.out.println();

        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
        filterAnimal(animals, a -> a instanceof Mammal);
        filteredList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        filteredList.forEach(a -> System.out.println(
                a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
        System.out.println();
    }
}