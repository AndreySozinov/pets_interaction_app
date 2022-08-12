package pets;

public class Cat extends BasePet implements BasePetAction {

    Cat(String name) {
        super(name);
    }
    
    @Override
    public void voice1() {
        System.out.printf("\n%s: meow!", this.name);
    }

    @Override
    public void voice2() {
        System.out.printf("\n%s: Frrr!", this.name);
    }
    
    @Override
    public void sleeping() {
        System.out.println("Mmrrr...");
    }

}
