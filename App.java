package pets;

public class App {
    public static void main(String[] args) {
        Cat tiger = new Cat("Tiger");
        Dog spike = new Dog("Spike");

        //tiger.voice();

        People Andrey = new People("Andrey");

        Andrey.callPet(tiger);
        Andrey.callPet(spike);
    }
}
