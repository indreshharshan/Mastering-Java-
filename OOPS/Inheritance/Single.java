
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}
//non static single inheritance 
class Dog extends Animal {

    void Bark() {
        System.out.println("Barking");
        //access parent class
    }
}

public class Single {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.Bark();
    }
}
