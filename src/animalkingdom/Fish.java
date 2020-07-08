package animalkingdom;

public class Fish extends Animal {

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    String breath() {
        return "gills";
    }

    @Override
    String move() {
        return "swim";
    }

    @Override
    String reproduce() {
        return "eggs";
    }
    
    
}