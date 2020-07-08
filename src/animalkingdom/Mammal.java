package animalkingdom;

public class Mammal extends Animal {

    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    String breath() {
        return "lungs";
    }

    @Override
    String move() {
        return "walk";
    }

    @Override
    String reproduce() {
        return "live birth";
    }
    
}