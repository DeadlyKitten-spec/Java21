public class Dog extends Animal{

    String name;

    @Override
    void slepp() {

    }

    @Override
    void eat() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Собачку зовут - %s, ей - %d лет, она весит - %d кг", name, age, weight);
    }
}
