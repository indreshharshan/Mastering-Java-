class Parent {

    final void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    //  Cannot override final method
    // @Override
    // void display() {
    //     System.out.println("Child");
    // }
}
public class FinalKeyword{
    public static void main(String[] args) {
        Parent obj=new Child();
        obj.display();

        Parent obj2=new Parent();
        System.out.println(obj2);
        obj2.display();
    }
}