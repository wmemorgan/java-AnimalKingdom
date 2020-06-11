package animalkingdom;

public class Fish extends Animal implements Behavior {

    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "egs";
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " year named: " + year;
    }
}