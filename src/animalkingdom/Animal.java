package animalkingdom;

abstract class Animal {
    private static int maxId;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public Animal(String name, int yearDiscovered) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    String eat() {
        return "Eat";
    }

    abstract String move();

    abstract String breath();

    abstract String reproduce();

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", Year Named: " + yearDiscovered;
    }
    
    
}