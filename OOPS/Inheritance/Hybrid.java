class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meowing");
    }
}

class Puppy extends Dog {

    void play() {
        System.out.println("Playing");
    }
}

public class Hybrid {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();

        Cat c = new Cat();

        c.eat();
        c.meow();
    }
}