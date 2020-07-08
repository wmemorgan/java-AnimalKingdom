package animalkingdom;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n*** Welcome to Cafe Morgan's Animal Kingdom ***\n");

        // Create Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        System.out.println(panda.getId() + " " + panda.getName() + " " + panda.move() + " " + panda.breath() + " "
                + panda.reproduce());
        System.out.println(zebra);

        // Create Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
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
    }
}