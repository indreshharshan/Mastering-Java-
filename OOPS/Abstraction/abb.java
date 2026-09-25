abstract class Sample {

    abstract void sound();  //abstract method has no body
    abstract void set();  
}

class Sample2 extends Sample {

    @Override
    void sound() {
        System.out.println("hiiii");
    }
     void set() {
            System.out.println("123");
        }
}

public class abb {

    public static void main(String[] args) {

        Sample obj = new Sample2();
        // sample kulla erukura abstract class func mattum than access pana mudiyum 
        
        obj.sound();
        obj.set();
    }
}

// Sample obj = new Sample2();
//    ↑             ↑
// Reference      Object