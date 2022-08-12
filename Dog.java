package pets;

public class Dog extends BasePet implements BasePetAction{

    public Dog(String name) {
        super(name);
    }

    void voice() {
        System.out.printf("\n%s: Woof!", this.name);
    }

    @Override
    public void Sleeping() {
        System.out.println("RRRR...");
    }
}
