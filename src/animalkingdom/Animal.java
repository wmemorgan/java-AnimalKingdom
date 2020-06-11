package animalkingdom;

abstract class Animal {
    protected static int maxId = 0;

    protected int id;
    protected String name;
    protected int year;

    public Animal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    String eat() {
        return "Eat";
    }
}