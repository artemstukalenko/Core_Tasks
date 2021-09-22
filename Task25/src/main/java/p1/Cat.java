package p1;

public class Cat {
    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String meow() {
        return "meow";
    }

    public String walk() {
        return "Cat is walking...";
    }
}

class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", "Abyssinian", 2);

        System.out.println(cat1.meow());
        System.out.println(cat1.walk());
    }
}