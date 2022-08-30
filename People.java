package pets;

public class People extends Human implements HumanAction{

    People(String name) {
        super(name);
    }   

    public void callCat(Cat cat) {
        System.out.printf("\n%s: kitty kitty!", this.name);
        if (this.name.equals("Andrey")) {
            cat.voice1();
        } else { cat.voice2(); }
    }

    public void callDog(Dog dog) {
        System.out.printf("\n%s: C'mon, boy!!", this.name);
        if (this.name.equals("Andrey")) {
            dog.voice1();
        } else { dog.voice2(); }
    }
}
