import java.util.Scanner;

public class heirarchical_inheritance7 {
    Scanner sc = new Scanner(System.in);
    int radius;

    void getr() {
        System.out.println("enter radius:");
        radius = sc.nextInt();
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.area();
        C obj1 = new C();
        obj1.circ();

    }

}

class B extends heirarchical_inheritance7 {

    void area() {
        getr();
        System.out.println("area is:" + (2 * 3.14 * radius * radius));

    }
}

class C extends heirarchical_inheritance7 {
    void circ() {
        getr();
        System.out.println("cicumgerence is:" + (2 * 3.14 * radius));
    }

}