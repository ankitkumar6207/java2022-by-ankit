import java.util.Scanner;

class cons1 {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    double marks;

    cons1() {
        System.out.println("enter id name and marks");
        this.id = sc.nextInt();
        this.name = sc.next();
        this.marks = sc.nextDouble();
        System.out.println("default constructor is running");
    }

    cons1(int id, String name, double marks) {
        System.out.println("parameterized constructor is running");
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    cons1(cons1 obj) {
        System.out.println("copy constructor is running");

        obj.id = this.id;
        obj.name = this.name;
        obj.marks = this.marks;
    }

    public void display() {
        System.out.println("id is:" + this.id + "\nname is:" + this.name + "\nmarks is:" + this.marks + "\n");

    }

    public static void main(String[] args) {
        cons1 o1 = new cons1();
        o1.display();
        cons1 o2 = new cons1(3, "ankit", 45.34);
        o2.display();
        cons1 o3=o1;
        o3.display();


    }

}
