package pets;

public abstract class Human{
    protected String name;

    protected Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
