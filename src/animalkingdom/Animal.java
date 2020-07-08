package animalkingdom;

abstract class Animal {
    private static int maxId;
    protected int id;
    protected String name;
    protected int yearNamed;

    public Animal(String name, int yearNamed) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
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

    public int getyearNamed() {
        return yearNamed;
    }

    public void setyearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    String eat() {
        return "Eat";
    }

    abstract String move();

    abstract String breath();

    abstract String reproduce();

    @Override
    public String toString() {
        return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "}";
    }

    // @Override
    // public String toString() {
    //     return "id: " + id + ", name: " + name + ", Year Named: " + yearNamed;
    // }
    
    
}