package pets;

public class App {
    public static void main(String[] args) {
        Cat tiger = new Cat("Tiger");
        Dog spike = new Dog("Spike");

        //tiger.voice();

        People Andrey = new People("Andrey");
        People Sergey = new People("Sergey");

        Andrey.callCat(tiger);
        Andrey.callDog(spike);

        Sergey.callDog(spike);
        Sergey.callCat(tiger);
    }
}
