package animalkingdom;

abstract class Animal {
    protected static int maxId = -1;

    protected int id;
    protected String name;
    protected int year;

    public Animal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    abstract String move();

    String eat() {
        return "Eat";
    }

    @Override
    // public String toString() {
    //     return "id: " + id + " name: " + name + " year named: " + year;
    // }
    public String toString() {
        return "Animals{id=" + id + ", name=" + "'" + name + "'" + ", yearNamed=" + year + "}";
    }
}