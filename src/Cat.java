public class Cat extends Animal{
    private String name;
    private int hp = 100;
    int happy = 5;

    public static int catCount;

    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
    }


    void slepp(int t){
        hp += t;
    }

    @Override
    void slepp() {
        hp++;
    }

    @Override
    void eat(){
        weight++;
        hp++;
    }

    void play(int t){
        weight -= t;
        happy++;
    }

    Cat fight(Cat c1, Cat c2){
        while (c1.hp > 0 && c2.hp > 0){
            c2.hp -= c1.weight * 2;
            c1.hp -= c2.weight * 2;
        }
        return c1.hp < 0 ? c2 : c1;
    }

    public String getName() {
        return name;
    }


    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return String.format("Котика зовут - %s, ему - %d лет, он весит - %d кг", name, age, weight);
    }
}
