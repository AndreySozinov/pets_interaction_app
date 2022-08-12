package pets;

public class Cat extends BasePet implements BasePetAction {

    Cat(String name) {
        super(name);
    }
 
    void voice() {
        System.out.printf("\n%s: meow!", this.name);
    }
    
    @Override
    public void Sleeping() {
        System.out.println("Mmrrr...");
    }
}
