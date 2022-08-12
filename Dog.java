package pets;

public class Dog extends BasePet implements BasePetAction{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice1() {
        System.out.printf("\n%s: Woof!", this.name);
    }

    @Override
    public void voice2() {
        System.out.printf("\n%s: GRRRR!", this.name);
    }

    @Override
    public void sleeping() {
        System.out.println("Zzzzzz...");
    }
}
