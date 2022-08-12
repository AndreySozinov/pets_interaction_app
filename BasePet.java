package pets;
// Описать логику взаимодействия человека и домашнего питомца. 
// Добавить разных животных. Добавить разные методы взаимодействия питомца и человека.
// Возможно добавить разных членов семьи? Нужно использовать абстрактные классы 
// и интерфейсы.
// Сценарий: Человек “зовёт” котика “кис-кис”, котик отзывается.

public abstract class BasePet {
    protected String name;
    protected String color;

    public BasePet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public BasePet(String name) {
        this(name, "grey");
    }
}
