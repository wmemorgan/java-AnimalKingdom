package animalkingdom;

public class Birds extends Animal implements Behavior {

    public Birds(String name, int year) {
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