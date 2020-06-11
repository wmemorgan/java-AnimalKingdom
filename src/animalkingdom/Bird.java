package animalkingdom;

public class Bird extends Animal implements Behavior {

    public Bird(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
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