package pets;

public class People extends Human implements HumanAction{

    People(String name) {
        super(name);
    }

    public void callPet(Cat cat) {
        System.out.printf("\n%s: kitty kitty!", this.name);
        cat.voice();
    }

    public void callPet(Dog dog) {
        System.out.printf("\n%s: C'mon, boy!!", this.name);
        dog.voice();
    }
}
