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
        System.out.println(panda.getId() + " " + panda.getName() + " " + panda.move() + " " + panda.breath() + " "
                + panda.reproduce());
        System.out.println(zebra);

        // Create Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);
        System.out.println(pigeon.getId() + " " + pigeon.getName() + " " + pigeon.move() + " " + pigeon.breath() + " "
                + pigeon.reproduce());
        System.out.println(peacock);
        
        // Create Fish
        Fish salmon = new Fish("Salmon", 1785);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        System.out.println(salmon.getId() + " " + salmon.getName() + " " + salmon.move() + " " + salmon.breath() + " "
                + salmon.reproduce());
        System.out.println(catfish);

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

        System.out.println("\n**** List of all animals ****");
        System.out.print(animals);
    }
}