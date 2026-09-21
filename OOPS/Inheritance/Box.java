
public class Box {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(0.1, 0.2, 0.3);
        System.out.println(box2.h + " " + box2.w + " " + box2.l);
        System.out.println(box1.h + " " + box1.w + " " + box1.l);
    }
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}
